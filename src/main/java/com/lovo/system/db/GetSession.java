package com.lovo.system.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author che
 * @title: GetSession
 * @projectName forestpestproject
 * @description: 得到sqlSession
 * @date 2019/6/1 20:03
 */
public class GetSession {

    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        final String SOURCE = "mybaitsConfig.xml";
        try (InputStream inputStream = Resources.getResourceAsStream(SOURCE)) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
