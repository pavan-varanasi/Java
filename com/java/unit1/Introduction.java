package com.java.unit1;

public class Introduction {
	private int first;
	private int second;
	private int sum;
	
	public Introduction(int x, int y) {
		this.first = x;
		this.second = y;
		
		sum = x+y;
	}

	public static void main(String[] args) {
		System.out.println("Adding two two numbers");
		Introduction intro = new Introduction(5, 7);
		
		System.out.println("The sum is:" + intro.sum);
	}
}
