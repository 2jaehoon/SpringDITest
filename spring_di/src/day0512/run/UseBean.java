package day0512.run;

import day0512.service.Service;

public class UseBean {

	public static void main(String[] args) {

		//조립자 클래스를 사용하여 bean을 받는다.
		Assembly ass = new Assembly();
		Service service = ass.getBean();
		//의존성 주입 받은 객체(약결합)가 제공하는 기능을 사용
		service.add("이재건");
		System.out.println(service.search());
		
	}//main

}
