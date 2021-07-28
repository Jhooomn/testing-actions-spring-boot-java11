package com.jhoomn.testingactionsspringbootjava11.service;

import com.jhoomn.testingactionsspringbootjava11.service.impl.DefaultHelloWorldService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class HelloWorldServiceTest {
  private DefaultHelloWorldService defaultHelloWorldService = new DefaultHelloWorldService();

  @Test
  public void helloWorldTest() {
    String response = defaultHelloWorldService.sayHello();
    Assertions.assertNotNull(response);
    Assertions.assertEquals(response, "Hello");
  }
}
