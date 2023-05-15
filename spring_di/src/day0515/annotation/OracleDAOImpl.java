package day0515.annotation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class OracleDAOImpl implements DAO{
	

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
