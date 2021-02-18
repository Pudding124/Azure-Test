package com.mars.tester.mars;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mars.tester.mars.service.Function;

@SpringBootTest
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
