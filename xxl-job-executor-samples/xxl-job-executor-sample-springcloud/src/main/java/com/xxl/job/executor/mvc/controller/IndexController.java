package com.xxl.job.executor.mvc.controller;//package com.xxl.job.executor.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class IndexController {


    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/")
    @ResponseBody
    String index() {
        return "xxl job executor running.";
    }

}