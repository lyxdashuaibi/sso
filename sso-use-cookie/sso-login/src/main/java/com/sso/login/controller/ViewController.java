package com.sso.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转逻辑
 */

@Controller
@RequestMapping("/view")
public class ViewController {
    @GetMapping("/login")
    public  String toLogin() {
        return "login";
    }
}
