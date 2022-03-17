package com.test.java.question.iteration;

public class Q07_SumNum3 {

	public static void main(String[] args) {
		
//		요구사항] 아래와 같이 출력하시오.
//		- 누적값이 1000을 넘어가는 순간 루프를 종료하시오.
		int sum = 0;
		
		for(int i=1; ; i++) {
			sum += i;
			System.out.print(i);
			
			if(sum > 1000) {
				System.out.printf(" = %d\n", sum);
				break;
			}
			
			System.out.print(" + ");
		}
	}
}

//		설계]
//		1. 무한루프 > for(int i=1;; i++)
//			1.1 값 더하기
//				- for문 밖에다가 sum변수선언
//				- for문 안에서 sum+=i
//			1.2 출력하기
//			- "i" 출력
//		2. 1000넘으면 종료
//			- if(sum>1000) { " = sum" 출력후 break;}
//			- " + " 출력