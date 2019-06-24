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

    public static SqlSessionFactory sqlSessionFactory; //工厂

    static {
        //配置文件，给mybaits的指令
        String resource = "mybaits.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //用建造者设计模式创建了一个SqlSessionFactory.
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try {
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获得一个Session，链接
    public static SqlSession creatSession(){
        return sqlSessionFactory.openSession();
    }
}

