package com.cz.ppttest.controller;

import org.springframework.web.bind.annotation.*;

/**
 * description
 *
 * @author pisx 2021/07/05 16:33
 */

@RestController
@RequestMapping("/PPT")
public class PPTController {

    @GetMapping("/export")
    public String exportPPT(){
        System.out.println("开始生成ppt");

        return "success";
    }


}
