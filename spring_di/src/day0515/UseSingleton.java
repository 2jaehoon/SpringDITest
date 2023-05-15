package day0515;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseSingleton {

	public static void main(String[] args) {
		
		//������ �����̳� ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0515/appContext.xml");
		//������ ���Թ��� ��ü ���
		Singleton single = ac.getBean("single", Singleton.class);
		
		//���
		System.out.println("���� ��ü : " + single);
	}

}
