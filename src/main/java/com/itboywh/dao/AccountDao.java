package com.itboywh.dao;

import com.itboywh.domin.Accout;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 账户的dao接口 @Repository交给ioc容器
 * @author wh
 * @date 2021年11月20日13:48
 */
@Repository
public interface AccountDao {
        //保存账户
        @Insert("insert into account(name,money) values(#{name},#{money})")
        public void saveAccount(Accout accout);
        //查询账户
        @Select("select * from account")
        public List<Accout> findAll();
}
