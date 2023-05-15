package day0515;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day0515.injection.InjectionTest;

public class UseSpringContainer2 {

	public static void main(String[] args) {
		
		//������ �����̳� ���� : ���� ������ ���� ����� �迭�� �Է��ϸ� �ȴ�.
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0515/applicationContext2.xml");
//		String[] config = {"day0515/applicationContext2.xml", "day0515/applicationContext.xml"};
//		ApplicationContext ac = new ClassPathXmlApplicationContext( config );
		
		
		//Service ��ü ��� : �ԷµǴ� bytecode(class)�� ������ ��ü�� ��ȯ
		//bytecode�� ���� ��ü�� �����ϸ� �ĺ��� ������ ������ �߻��Ѵ�.
		//getBean( class, "���̵�" )
		InjectionTest it = ac.getBean(  "it", InjectionTest.class );
		
		//�� ��ü���� method ȣ��
		System.out.println("it ��ü �̸� : " + it.getName() + ", ���� : " + it.getAge() );
		
		InjectionTest it1 = ac.getBean("it1", InjectionTest.class);
		System.out.println("it1 ��ü �̸� : " + it1.getName() + ", ���� : " + it1.getAge() );
		
		//List ������ ����
		InjectionTest it2 = ac.getBean("itList", InjectionTest.class);
		System.out.println(it2.getList());
		
		//Map ������ ����
		InjectionTest it3 = ac.getBean("itMap", InjectionTest.class);
		System.out.println(it3.getMap());
		
		

	}//main

}//class
