package day0515.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseAnnotation {

	public static void main(String[] args) {
		//������ �����̳� ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0515/annotation/annAppCon.xml");
		//������ ���� ���� ��ü ���
		ServiceImpl2 si = ac.getBean(ServiceImpl2.class);
		//���
		si.add("�׽�Ʈ");
		System.out.println(si.search());
	}//main

}//class
