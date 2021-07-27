package com.jhoomn.testingactionsspringbootjava11.service;

import com.jhoomn.testingactionsspringbootjava11.service.impl.DefaultHelloWorldService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class HelloWorldServiceTest {

  @InjectMocks private HelloWorldService helloWorldService = new DefaultHelloWorldService();

  @Mock private DefaultHelloWorldService defaultHelloWorldService;

  @Test
  public void helloWorldTest() {
    Mockito.when(defaultHelloWorldService.sayHello()).thenReturn("Hello");
    String response = helloWorldService.sayHello();
    Assertions.assertEquals(response, "Hello");
  }
}
