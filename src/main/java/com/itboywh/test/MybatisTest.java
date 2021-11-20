package com.itboywh.test;

import com.itboywh.dao.AccountDao;
import com.itboywh.domin.Accout;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.InputStream;
import java.util.List;

/**
 * @author wh
 * @date 2021年11月20日15:55
 */
public class MybatisTest {
    /**
     * 测试查询所有
     * @throws Exception
     */
    @Test
    public void run1() throws Exception{
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession();
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        List<Accout> list= dao.findAll();
        for(Accout accout:list){
            System.out.println(accout);
        }
        is.close();
        sqlSession.close();

    }

    /**
     * 测试保存
     * @throws Exception
     */
    @Test
    public void run2() throws Exception{
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession();
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        Accout accout=new Accout();
        accout.setName("小华");
        accout.setMoney(100000.00);
        dao.saveAccount(accout);
        //增删改需要提交事务
        sqlSession.commit();
        is.close();
        sqlSession.close();

    }
}
