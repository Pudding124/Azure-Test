package com.mars.tester.mars;

import org.junit.Test;

import junit.framework.Assert;

public class FunctionTest {

	@Test
    public void add_TwoPlusTwo_ReturnsFour() {
      final int expected = 4;
      final int actual = Function.add(2, 2);
      Assert.assertEquals(expected, actual);
    }   
	
	@Test
    public void multiply_FourTimesTwo_ReturnsEight() {
      final int expected = 8;
      final int actual = Function.multiply(4, 2);
      Assert.assertEquals(expected, actual);
    }
}        
