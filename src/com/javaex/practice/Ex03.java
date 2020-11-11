package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2; //4
		int b = y++ *2; //2*1 로 출력이 된 후 ++가 적용됨 그래서 b=2
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("x=" + x);
		System.out.println("y=" + y); //y=1*2 상태로 출력됨
		
		System.out.println(b);
		System.out.println(y);
	}
}
