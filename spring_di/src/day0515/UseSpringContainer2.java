package day0515;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day0515.injection.InjectionTest;

public class UseSpringContainer2 {

	public static void main(String[] args) {
		
		//스프링 컨테이너 생성 : 설정 파일이 여러 개라면 배열로 입력하면 된다.
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0515/applicationContext2.xml");
//		String[] config = {"day0515/applicationContext2.xml", "day0515/applicationContext.xml"};
//		ApplicationContext ac = new ClassPathXmlApplicationContext( config );
		
		
		//Service 객체 얻기 : 입력되는 bytecode(class)로 생성된 객체가 반환
		//bytecode로 여러 객체가 존재하면 식별의 문제로 에러가 발생한다.
		//getBean( class, "아이디" )
		InjectionTest it = ac.getBean(  "it", InjectionTest.class );
		
		//얻어낸 객체에서 method 호출
		System.out.println("it 객체 이름 : " + it.getName() + ", 나이 : " + it.getAge() );
		
		InjectionTest it1 = ac.getBean("it1", InjectionTest.class);
		System.out.println("it1 객체 이름 : " + it1.getName() + ", 나이 : " + it1.getAge() );
		
		//List 의존성 주입
		InjectionTest it2 = ac.getBean("itList", InjectionTest.class);
		System.out.println(it2.getList());
		
		//Map 의존성 주입
		InjectionTest it3 = ac.getBean("itMap", InjectionTest.class);
		System.out.println(it3.getMap());
		
		

	}//main

}//class
