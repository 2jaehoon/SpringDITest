package day0512.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLDAOImpl implements DAO{
	
	 public MySQLDAOImpl() {
		 System.out.println("MySQLDAOImpl �⺻ ������");
	}

	@Override
	public void insert(String name) throws SQLException {
		System.out.println("MySQL dbms�� insert �۾�");
		
	}//insert

	@Override
	public List<String> select() throws SQLException {
		List<String> list = new ArrayList<String>();
		list.add("��Թ�");
		list.add("��ΰ�");
		list.add("�躸��");
		list.add("������");
		list.add("������");
		list.add("�̹���");
		
		return list;
	}//select

	
}
