package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 页面辅助测试
 *
 * @author DELL_
 * @date 2022/03/17
 */
public class PageHelperTest {

    @Test
    public void pageHelperTest() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession(true);

            // 只需要新建一个 分也实体PageHelper调用方法即可
            Page<Object> page = PageHelper.startPage(4, 4);

            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            List<Emp> emps = mapper.selectByExample(null);
//            emps.forEach(System.out::println);

            // 另一个分页对象. navigatePages: 这个参数指的是导航页个数. 比如固定显示五页. 固定七页等等.
            PageInfo<Emp> empPageInfo = new PageInfo<Emp>(emps, 5);


//            System.out.println(page);
            System.out.println(empPageInfo);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
