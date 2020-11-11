package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수: ");
		int five_h = sc.nextInt();
		
		System.out.print("100원 개수: ");
		int one_h = sc.nextInt();
		
		System.out.print("50원 개수: ");
		int five_t = sc.nextInt();
		
		System.out.print("10원 개수: ");
		int one_t = sc.nextInt();
		
		int money = (five_h*500)+(one_h*100)+(five_t*50)+(one_t*10);
		
		System.out.println("동전의 총 합은 "+money+" 원 입니다.");
		
		sc.close();
	}
}
