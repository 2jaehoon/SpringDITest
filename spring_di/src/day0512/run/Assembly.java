package day0512.run;

import day0512.dao.DAO;
import day0512.dao.MySQLDAOImpl;
import day0512.dao.OracleDAOImpl;
import day0512.service.Service;
import day0512.service.ServiceImpl;

public class Assembly {

	public Service getBean() {
		//1. ������ ������ ��ü�� ����
		DAO dao = new MySQLDAOImpl();
		//2. ������ ���Թ��� ��ü�� ����
		Service service = new ServiceImpl(dao); 
		//3. ������ ���Թ��� ��ü�� �޼��� ȣ��
		return service;
	}
	
}
