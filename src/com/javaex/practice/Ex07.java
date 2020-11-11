package com.javaex.practice;

public class Ex07 {
	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i); //11
		System.out.println(n); //1
		
		/*Ex06 과 Ex07 이 다른 점
		 * ++가 앞에 있을 경우 먼저 적용된 후 나머지 연산을 적용시킴
		 * ++가 뒤에 있을 경우 i %2 가 먼저 계산 되어 n값을 만든 후 ++가 적용됨
		 * 고로 Ex06에서는 i%2 다음 = 이 적용되어 0의 값이 나옴
		 */
	}
}
