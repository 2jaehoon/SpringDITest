package day0512.run;

import day0512.service.Service;

public class UseBean {

	public static void main(String[] args) {

		//������ Ŭ������ ����Ͽ� bean�� �޴´�.
		Assembly ass = new Assembly();
		Service service = ass.getBean();
		//������ ���� ���� ��ü(�����)�� �����ϴ� ����� ���
		service.add("�����");
		System.out.println(service.search());
		
	}//main

}
