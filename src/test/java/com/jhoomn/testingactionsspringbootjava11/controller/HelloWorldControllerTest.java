package com.jhoomn.testingactionsspringbootjava11.controller;

import com.jhoomn.testingactionsspringbootjava11.service.HelloWorldService;
import lombok.val;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class HelloWorldControllerTest {
  @InjectMocks private HelloWorldController helloWorldController;
  @Mock private HelloWorldService helloWorldService;

  @Test
  public void sayHelloEndPointTest() throws Exception {
    Mockito.when(helloWorldService.sayHello()).thenReturn("Hello");
    val response = helloWorldController.sayHelloEndPoint();
    Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
    Assertions.assertEquals(response.getBody(), "Hello");
  }
}
