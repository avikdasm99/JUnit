package com.demo.test;

import com.demo.main.Junit_demo1;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
public class Junit_Test1 {

	@Test
	public void max() {
		assertEquals(8,Junit_demo1.findmax(new int[] {1,3,8,7}));
		assertEquals(1,Junit_demo1.findmax(new int[] {1,-3,-8,-9}));
		assertEquals(9,Junit_demo1.findmax(new int[] {1,3,8,9}));
	}
}
