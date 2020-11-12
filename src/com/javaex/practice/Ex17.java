package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		final double PI = 3.14;
		
		double ban = sc.nextDouble();
				
		System.out.println("구의 부피는: " + (double)4/(double)3*PI*ban*ban*ban);
		
		sc.close();
	}
}
