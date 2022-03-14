package com.atguigu.mapper;

import com.atguigu.domain.Employee;
import com.atguigu.util.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class CacheMapperTest {

    /*
        二级缓存使用的前提:
            1- 实体类必须实现Serializable接口
            2- 全局标签开启 cacheEnabled = true(这个实际上默认开启)
            3- 在需要使用二级缓存的映射文件中使用 <cache /> 标签
            4- 一个SqlSession操作完成之后必须进行关闭(仅仅提交是不可以的)
     */
    @Test
    public void testSecondCache() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession1 = build.openSession(true);
            SqlSession sqlSession2 = build.openSession(true);

            // 通过 sqlSession1 查询
            CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
            System.out.println(mapper1.getEmployeeById(5));

            // 条件缺一不可. 需要关闭sqlSession1才可以
            sqlSession1.close();

            // 通过 sqlSession2 查询
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
            // Cache Hit Ratio [com.atguigu.mapper.CacheMapper]: 0.5 (LoggingCache.java:60)
            System.out.println(mapper2.getEmployeeById(5));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testCleanCache() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        CacheMapper cacheMapper1 = sqlSession.getMapper(CacheMapper.class);
        Employee employeeById = cacheMapper1.getEmployeeById(5);
        System.out.println(employeeById);

        // 手动清空缓存 -> 清空一级
        sqlSession.clearCache();

        CacheMapper cacheMapper2 = sqlSession.getMapper(CacheMapper.class);
        Employee employeeById1 = cacheMapper2.getEmployeeById(5);
        System.out.println(employeeById1);
    }

    @Test
    public void testCache() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        CacheMapper cacheMapper1 = sqlSession.getMapper(CacheMapper.class);
        Employee employeeById = cacheMapper1.getEmployeeById(5);
        System.out.println(employeeById);

        // 执行一次新增操作
        cacheMapper1.insertEmployee(new Employee(null, "lit", 98, "男", "lit@163.com"));

        CacheMapper cacheMapper2 = sqlSession.getMapper(CacheMapper.class);
        Employee employeeById1 = cacheMapper2.getEmployeeById(5);
        System.out.println(employeeById1);
    }

    @Test
    public void getEmployeeById2() {
        SqlSession sqlSession1 = SqlSessionUtils.getSqlSession();
        assert sqlSession1 != null;
        CacheMapper cacheMapper1 = sqlSession1.getMapper(CacheMapper.class);
        Employee employeeById = cacheMapper1.getEmployeeById(1);
        System.out.println(employeeById);

        // 更换了SqlSession之后就执行了两次SQL
        SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
        assert sqlSession2 != null;
        CacheMapper cacheMapper2 = sqlSession2.getMapper(CacheMapper.class);
        Employee employeeById2 = cacheMapper1.getEmployeeById(1);
        System.out.println(employeeById2);
    }

    @Test
    public void getEmployeeById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        CacheMapper cacheMapper1 = sqlSession.getMapper(CacheMapper.class);
        Employee employeeById = cacheMapper1.getEmployeeById(1);
        System.out.println(employeeById);

        // 虽然查询两次 id=1 的员工信息, 但是只执行了一条SQL
        CacheMapper cacheMapper2 = sqlSession.getMapper(CacheMapper.class);
        Employee employeeById1 = cacheMapper2.getEmployeeById(1);
        System.out.println(employeeById1);
    }
}
