package day0515;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseSingleton {

	public static void main(String[] args) {
		
		//스프링 컨테이너 생성
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0515/appContext.xml");
		//의존성 주입받은 객체 얻기
		Singleton single = ac.getBean("single", Singleton.class);
		
		//사용
		System.out.println("얻은 객체 : " + single);
	}

}
