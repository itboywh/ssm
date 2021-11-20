package com.itboywh.service;

import com.itboywh.domin.Accout;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wh
 * @date 2021年11月20日13:53
 */

public interface AccoutService  {
    //保存账户
    public void saveAccount(Accout accout);
    //查询账户
    public List<Accout> findAll();
}
