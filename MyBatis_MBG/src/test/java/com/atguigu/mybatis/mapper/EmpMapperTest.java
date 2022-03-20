package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * emp映射器测试
 *
 * @author DELL_
 * @date 2022/03/19
 */
public class EmpMapperTest {

    /**
     * 选择例子
     */
    @Test
    public void selectByExample() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            List<Emp> emps = mapper.selectByExample(null);
            // emps.forEach(System.out::println);

            // QBC查询风格 -> 根据条件查询.
            EmpExample empExample = new EmpExample();
            // 这个createCriteria()方法是构造一个查询规则容器, 根据容器中的条件进行查询
            empExample.createCriteria().andAgeGreaterThanOrEqualTo(20).andAgeLessThan(30);
            List<Emp> emps1 = mapper.selectByExample(empExample);
            emps1.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByExampleSelective() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            mapper.updateByPrimaryKey(new Emp(10, "test", 89, null, 2));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
