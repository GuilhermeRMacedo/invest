package com.guimac.invest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvestController {

    @GetMapping("hello-world")
    public String getMethodName() {
	return "hello world";
    }

}