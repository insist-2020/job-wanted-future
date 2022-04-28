package com.base.job.controller;

import com.base.job.model.IndexCount;
import com.base.job.model.Tab;
import com.base.job.result.BaseResult;
import com.base.job.service.CompanyService;
import com.base.job.service.JobService;
import com.base.job.service.TabService;
import com.base.job.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TabController {

    @Autowired
    TabService tabService;
    @Autowired
    UserService userService;
    @Autowired
    JobService jobService;
    @Autowired
    CompanyService companyService;

    @RequestMapping("selectTabAll")
    public List<Tab> selectTabAll(){
        return tabService.selectTabAll();
    }


    @RequestMapping("openMain")
    public String openMain(){
        return "main-page";
    }



}
