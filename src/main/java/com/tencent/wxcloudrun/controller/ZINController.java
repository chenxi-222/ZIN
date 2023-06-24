package com.tencent.wxcloudrun.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")
public class ZINController{

  @GetMapping
  public String sayo(){
    return "你好欢迎来到zinzin";
  }

  @GetMapping(value = "/xixi")
  public String say0o(){
    return "你好欢迎来到zinzin2";
  }
}