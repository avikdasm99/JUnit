package com.demo.main;

public class Junit_demo1 {

	public static int findmax(int[]arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
		}System.out.println("MAX = "+max);	
	}return max;
  }
}
