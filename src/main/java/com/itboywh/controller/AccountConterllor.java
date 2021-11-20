package com.itboywh.controller;

import com.itboywh.domin.Accout;
import com.itboywh.service.AccoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * account控制器
 * @author wh
 * @date 2021年11月20日13:56
 */
@Controller
@RequestMapping("/account")
public class AccountConterllor {
    @Autowired
    private AccoutService accoutService;
    @RequestMapping("findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有执行了");
       List<Accout> list= accoutService.findAll();
       model.addAttribute("list",list);
        for(Accout accout:list){
           System.out.println(accout);
        }
        return "list";

    }
    @RequestMapping("/save")
    public void save(Accout accout, HttpServletResponse response, HttpServletRequest request) throws Exception{
        System.out.println("表现层：查询所有执行了");
        accoutService.saveAccount(accout);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return ;

    }
}
