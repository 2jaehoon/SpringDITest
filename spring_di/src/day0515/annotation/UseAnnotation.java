package day0515.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseAnnotation {

	public static void main(String[] args) {
		//스프링 컨테이너 생성
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0515/annotation/annAppCon.xml");
		//의존성 주입 받은 객체 얻기
		ServiceImpl2 si = ac.getBean(ServiceImpl2.class);
		//사용
		si.add("테스트");
		System.out.println(si.search());
	}//main

}//class
