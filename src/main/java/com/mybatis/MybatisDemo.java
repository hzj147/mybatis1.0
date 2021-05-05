package com.mybatis;

import com.dao.UserDao;
import com.pojo.User;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MybatisDemo {
    public static void main(String[] args) {
        fun2();
    }

    private static void fun2() {
        try {
            SqlSession sqlSession = initSQLSession();
            User user=new User(1,"张杰",null,null);
            List<User> queryAll = sqlSession.selectList("selectUserOne",user);
            for (User dept: queryAll) {
                System.out.println(dept);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fun1() {
        try {
            SqlSession sqlSession = initSQLSession();
            List<User> queryAll = sqlSession.selectList("selevtUser");
            for (User dept: queryAll) {
                System.out.println(dept);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static SqlSession initSQLSession() throws IOException {
        Reader read = Resources.getResourceAsReader("MyBatisConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory =builder.build(read);
        return factory.openSession();
    }
}
