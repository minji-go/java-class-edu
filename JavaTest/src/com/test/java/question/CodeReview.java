package com.test.java.question;

import com.test.java.Ex22_for;

public class CodeReview {

	public static void main(String[] args) {
		

//		datetime ]===============================================================================
//		1.	HOUR_OF_DAY(24H) 
//			HOUR(12H) > 0 ~ 11 > 12시일때 12가 아닌 0으로 표현됨
		
//		4.	월(month)을 입력받을 때 > month는 0~11 > -1 (***)
		
//		5. 	아빠와 딸의 생년월일을 입력받고 며칠을 더 살았는지 계산 > 아빠Tick - 딸TIck(X) > 딸Tick - 아빠Tick(O)

		
//		conditional-if]========================================================================== 
//		3. 	입력받은 하나의 문자를 char로 형변환하여 유효성 검사 > 입력받은 문자가 두 문자이면 유효성 검사가 안됨
		
//		5. 	if문으로 연산자에 따라 나눴다면 > 연산자를 %c로 할 필요 없이 +, -, *, /, %로 바로 표현

//		7. 	입력하는 숫사의 개수가 정해져 있다면 > 홀수의 갯수 = 총 갯수 - 짝수의 갯수

//		8. 	총 주차시간(분) > 시각 - 시각 > 계산해야 하는 결과값이 하루 내의 시간!! > 0시 0분을 기준으로 '분'으로 변환 
//			int parkingMin = (exitHour - entryHour) * 60 + (exitMin - entryMin);
//			=> int parkingMin = (exitHour * 60 + exitMin) - (entryHour * 60 + entryMin);
		
		
//		iteration-for]=========================================================================== 
		
//		6.	(1) 잘못 풀었음 (***)(***) > for문을 쓸 때 루프변수에 주의하기
//				- for(int i=startNum; i<=endNum; i++) {} //startNum 입력한 시작숫자 endNum 입력한 종료숫자
//				- for문에서 루프변수(i)가 직접 사용되면, 루프변수의 의미가 몇번째 인지를 나타내는지 혹은 특정 값을 나타내는지를 주의!!!(***) 
//		
//			(2) 1 - 2 + 3 - 4 + 5 = 3를 출력할 때, 의미단위로 묶으면 좋음 
//				(1 - ) (2 + ) (3 - ) (4 + ) (5 = 3) > 코드가 짧아짐
//			=> 	(1) (- 2) (+ 3) (- 4) (+ 5) (= 3) > 출력부호와 실제 덧셈뺄셈이 일치해서 의미파악이 쉬움
//		
//			(3) 출력을 할 때
//				방법1: int order=1;을 선언하고 for문 안에서 order++;를 하면서 홀수번째 짝수번째인지로 판단하기 
//				방법2: int sign=1;을 선언하고 for문 안에서 sign*=(-1);을 하면서 부호가 +인지 -인지로 판단하기
		
//		8. 	(1) 잘못 풀었음 (***)(***) 
//				- (o) 서기 1년 1월 1일부터 서기 2022년 1월 1일까지는 며칠인지는 잘 구함
//				- (x) 2022년 1월 1일부터 2022년 3월 17일까지 며칠인지 구할 때 윤년을 고려하지 않음		
			
//			(2) 윤년인지를 구할 때, 4년마다 1년을 더하고, 100년마다 1년을 빼고, 400년마다 1년을 더한다.
//				((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) 
//			=> 	(year % 400 == 0) 
//			
//			(3) Ex22_for > m13()
		
//		9. 변수명만 봐도 의미를 알 수 있도록!!
//			(input == num)  //사용자가 입력한 숫자 == 컴퓨터가 생각한 숫자
//		   	=> (userNum == ComNum) 
		
//		iteration-while] Q11~Q14 ================================================================
		
//		10. (1) 원하는 만큼 입력받은 값을 마지막에 출력하려면 String 변수를 선언하고 문자열 누적! ***
//		
//			(2) for(loop) { if(sum >= 100) {loop = false}}  (x)
//			=> 	for(sum < 100) {} (o)

		
//		iteration-다중for] Q15~Q26 ===============================================================
		
//		19. 2중for문 2개에서 안쪽for문의 식만 규칙적으로 다를 때 -> 3중for문 1개로 표현 가능
		
//		22.	(1) "\b"는 삭제가 아니라 커서를 한 문자 앞으로!!!! (***) 	
//			(2) 공약수를 구할 때, 작은 수와 큰 수를 구분할 필요가 없음 (***) -> 불필요한 코드 삭제
		
//		26. 1 + 1 + 2 + 3 + 5 + .. + 89 = 232 를 계산할 때
//			(n1) + (n2) + (n1 += n2) + (n2 += n1) (x) 	//복잡하게 느껴지는 구조
//			=> n2 + n2 + n2 + n2 (o)  					//n1=0, n2=1 -> temp = n1+n2; n1=n2; n2=temp;
		
//		array]======================================================================================
		
//		6.
		
//		9.
		
//		두번쨰 문제 check
//		16. 처음에 초기화로 " "를 지정해주고 나중에 "■"로 덮어 쓸 수 있음.
//		마지막 세문자
		
//		string]======================================================================================
		
//		2. 이메일 abc@naver.com 아이디를 추출할 때,
//			=> split("@")
//			=> substring(email.substring(0, email.indexOf("@")) >  substring와 indexOf를 동시에 사용할 수도 있음
		
//		4. 파일명 abc.jpg에서 확장자 jpg의 갯수를 셀때.
//			if (file.substring(lastIndexOf(".") + 1).equals("jpg")) count++;
//			=> if (file.endsWith("jpg")) count++; > endsWith( )가 훨씬 간결함 (***)
		
//		5. while문에 생각없이 true값을 가지는 loop를 넣지 말 것 (***) > 이 문제는 while(index > -1)가 훨씬 간결해짐
		
		
		
//		9. replace().replace() 두번도 가능
//		
//		11. 
		
	}
}



















