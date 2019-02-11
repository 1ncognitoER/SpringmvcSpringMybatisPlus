package com.czy.ssmplus.controller;

import com.czy.ssmplus.model.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.czy.ssmplus.service.DemoTestService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class DemoTestController {
    /* 属性 */
    @Resource
    private DemoTestService demoTestService;

    @RequestMapping("selectAll")
    public String selectAll(HttpServletRequest request){
        List<Persons> personsList = demoTestService.selectAll();
        request.setAttribute("personsList", personsList);
        return "index";
    }

}
