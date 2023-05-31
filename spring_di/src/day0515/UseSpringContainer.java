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
		//MethodService.class => 왜? getBean(찾을 클래스 파일) byte 코드
		
		// 클래스를 넣어 객체를 찾고 할당
		//MethodService ms = ac.getBean(MethodService.class); 객체 생성 SpringContainer
		
		//아이디를 넣으면 객체를 찾고 > 부모로 얻어와서 > 자식으로 변환한 다음 할당 => 느림
		MethodService ms = (MethodService)ac.getBean("ms");
		
		ms.add("테스트2");
		System.out.println(ms.search());
		MethodService ms2 = (MethodService)ac.getBean("ms");
		MethodService ms3 = (MethodService)ac.getBean("ms");
		
		System.out.println(ms + " " + ms2 + " " + ms3);
		
	}//main
	
}//class
