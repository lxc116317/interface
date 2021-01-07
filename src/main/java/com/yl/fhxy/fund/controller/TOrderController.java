package com.yl.fhxy.fund.controller;


import com.yl.fhxy.fund.entity.TOrder;
import com.yl.fhxy.fund.service.TOrderService;
import com.yl.fhxy.fund.utils.result.Result;
import com.yl.fhxy.fund.utils.result.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/fund/tOrder")
@Api(tags = "订单")
public class TOrderController {



    @Autowired
    private TOrderService tOrderService;

    @PostMapping("add")
    @ApiOperation("新增订单")
    public Result add(@RequestBody TOrder tOrder){
        return new Result(tOrderService.save(tOrder),StatusCode.RET_SUCCESS);
    }

}

