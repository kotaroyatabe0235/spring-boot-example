package com.example.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

  @GetMapping("/echo-id")
  public String echoId(@RequestParam("id") String id) {
    return id;
  }
}
