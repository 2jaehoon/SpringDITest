package day0512.run;

import day0512.dao.DAO;
import day0512.dao.MySQLDAOImpl;
import day0512.dao.OracleDAOImpl;
import day0512.service.Service;
import day0512.service.ServiceImpl;

public class Assembly {

	public Service getBean() {
		//1. 의존성 주입할 객체를 생성
		DAO dao = new MySQLDAOImpl();
		//2. 의존성 주입받을 객체를 생성
		Service service = new ServiceImpl(dao); 
		//3. 의존성 주입받은 객체의 메서드 호출
		return service;
	}
	
}
