package day0512.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleDAOImpl implements DAO{
	
	public OracleDAOImpl() {
		System.out.println("OracleDAOImpl �⺻ ������");
	}

	@Override
	public void insert(String name) throws SQLException {
		System.out.println("����Ŭ dbms�� insert �۾�");
		
	}//insert

	@Override
	public List<String> select() throws SQLException {
		List<String> list = new ArrayList<String>();
		list.add("Ȳ�濬��");
		list.add("������");
		list.add("������");
		list.add("�����");
		list.add("����ȣ");
		
		return list;
	}//select

	
}
