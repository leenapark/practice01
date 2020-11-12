package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("마일을 입력하세요: ");
		final double MILE = 1.609;
		
		double space = sc.nextDouble();
		
		double km = space * MILE;
		
		System.out.println(space+"마일은 "+km+"킬로미터 입니다.");
		
		sc.close();
	}
}
