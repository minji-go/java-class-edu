package com.test.spring.di02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex02 {

	public static void main(String[] args) {
		
		//m1();
		m2();
	}
	
	private static void m2() {
		
		
		//Spring은 DI를 선택!
		
 		//Ex02 > Hong > Pen
		//Ex02 > Lee > Brush
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/di02/di02.xml");
		
		Hong hong = (Hong)context.getBean("hong");
		hong.run();
		
		
		//의존 객체x  > java.lang.NullPointerException
		Lee lee = (Lee)context.getBean("lee");
		lee.run();
		
	}
	
	
	private static void m1() {
		
		//스프링 환경 > 객체 생성 + 소멸 > 스프링 관리
		// > 관리 XML 필요
		
		//Pen 객체 생성하기
		Pen p1 = new Pen();
		p1.write();
		
		
		//XML 설정 읽기 > bean 인식 > 호출
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/di02/di02.xml");
		
		//getBean() > 식별자를 검색 > 해당 클래스의 인스턴스 생성 + 반환
		Pen p2 = (Pen)context.getBean("pen");	//id
		p2.write();
		
		Brush b1 = (Brush)context.getBean("brush");
		b1.draw();
		
		Pen p3 = (Pen)context.getBean("pen1");  	//name   
		p3.write();		
		
		
		
		Pen p4 = (Pen)context.getBean("pen2");  	//name  > id와 name은 똑같으나, name은 이름을 여러개 줄 수 있음
		p4.write();	
		Pen p5 = (Pen)context.getBean("pen3");
		p5.write();
		
		
	}
}
