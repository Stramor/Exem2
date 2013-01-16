package com.stramor.ex2;

import org.junit.Test;
import org.testng.Assert;

public class Example1Test {
  @Test
  public void testSin() throws Exception {
    Assert.assertEquals(Math.sin(Math.PI / 2.0), 1.0, 1.0e-15);
    Assert.assertEquals(Math.sin(Math.PI), 0.0, 1.0e-15);
  }

  @Test
  public void testCos() throws Exception {
    Assert.assertEquals(Math.cos(Math.PI / 2.0), 0.0, 1.0e-15);
  }
}
