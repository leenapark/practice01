package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 원화를 입력하세요: ");
		/*final double dollar = 1230.95;
		
		double money = sc.nextDouble();
		
		usd = money / dollar;
		
		System.out.println(usd);*/
		
		final double dollar = 1230.95;
		double usd;
		
		double money = sc.nextDouble();
		
		usd = money / dollar;
				
		System.out.println("받으실 달러는 "+usd);
		
		sc.close();
	}
}
