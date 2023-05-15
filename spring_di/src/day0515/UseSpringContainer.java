package day0515;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day0512.service.ServiceImpl;
import day0515.service.MethodService;

/**
 * SpringContainer ( 설정 파일 : ( applicationContext.xml )을 입력 받아
 * 설정 파일 안에 있는 <bean>들을 생명 주기를 관리하고(객체 생성하고) 의존성 주입을 수행하는 일 )
 * @author user
 *
 */
public class UseSpringContainer {

	public static void main(String[] args) {
		
		//SpringContainer 생성
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0515/applicationContext.xml");
		
		//SpringContainter에서 bean 얻기
		ServiceImpl si =  ac.getBean(ServiceImpl.class);
		
		//Service 객체가 제공하는 기능을 사용
		si.add("테스트");
		System.out.println(si.search());
		
		MethodService ms = ac.getBean(MethodService.class);
		ms.add("테스트2");
		System.out.println(ms.search());
		
	}//main
	
}//class
