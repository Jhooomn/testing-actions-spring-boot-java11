package com.jhoomn.testingactionsspringbootjava11.controller;

import com.jhoomn.testingactionsspringbootjava11.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class HelloWorldController {

  @Autowired private HelloWorldService helloWorldService;

  @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<String> sayHelloEndPoint() {
    return new ResponseEntity(helloWorldService.sayHello(), HttpStatus.OK);
  }
}
