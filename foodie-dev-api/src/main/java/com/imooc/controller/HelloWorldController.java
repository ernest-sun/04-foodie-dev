package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunzheng
 * @description
 * @date 2022/01/06
 */
@RestController
@RequestMapping("/api/v1/hello")
public class HelloWorldController {

  @GetMapping("/hello")
  public String hello() {
    return "hello world";
  }

}
