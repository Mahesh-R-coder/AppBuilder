package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Simple controller exposing two page endpoints.
 */
@Controller
public class PageController {

    @GetMapping("/page1")
    public String getPage1() {
        // Returns the logical view name resolved by Thymeleaf
        return "page1";
    }

    @GetMapping("/page2")
    public String getPage2() {
        // Returns the logical view name resolved by Thymeleaf
        return "page2";
    }
}
