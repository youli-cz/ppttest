package com.cz.ppttest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author pisx 2021/07/05 16:15
 */

@Api(tags = "hello world 测试")
@RestController
public class HelloController {

    @ApiOperation("返回hello world")
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
