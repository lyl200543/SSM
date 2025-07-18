package com.lyl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *ClassName: ProductController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/18 18:38
 *@Author lyl
 *@Version 1.0
 */
@Controller
@RequestMapping("/product")
public class ProductController {
//    @RequestMapping("/product/detail")
    @RequestMapping("/detail")
    public String product_detail(){
        return "product_detail";
    }
}
