package com.jhoomn.testingactionsspringbootjava11.service.impl;

import com.jhoomn.testingactionsspringbootjava11.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class DefaultHelloWorldService implements HelloWorldService {
  @Override
  public String sayHello() {
    return "Hello";
  }
}
