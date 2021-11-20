package com.itboywh.service.impl;

import com.itboywh.dao.AccountDao;
import com.itboywh.domin.Accout;
import com.itboywh.service.AccoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wh
 * @date 2021年11月20日13:55
 */
@Service("accoutService")
public class AccourServiceImpl implements AccoutService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public void saveAccount(Accout accout) {
        System.out.println("业务层:保存账户");
         accountDao.saveAccount(accout);
    }

    @Override
    public List<Accout> findAll() {
        System.out.println("业务层:查询所有");
        return accountDao.findAll();
    }
}
