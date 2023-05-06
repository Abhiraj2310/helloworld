package com.coveros.demo.helloworld;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

  @Test
  public void testHelloWorld() {
    String expectedOutput = "Hello, World! The current time is ";
    assertTrue(HelloWorld.main(new String[0]).startsWith(expectedOutput));
  }
  
}
