package com.yl.fhxy.fund.controller;


import com.yl.fhxy.fund.service.TElderService;
import com.yl.fhxy.fund.utils.result.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lxc
 * @since 2020-12-12
 */
@RestController
@RequestMapping("/fund/tElder")
@Api(tags = "测试")
public class TElderController {

    @Autowired
    private TElderService tElderService;


    @GetMapping("test")
    public Result test(){
        return new Result("123");
    }

    @GetMapping("testTimeOut")
    public Result testTimeOut(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Result("123...testTimeOut");
    }
}

