package day0515.annotation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class OracleDAOImpl implements DAO{
	

	@Override
	public void insert(String name) throws SQLException {
		System.out.println("오라클 dbms에 insert 작업");
		
	}//insert

	@Override
	public List<String> select() throws SQLException {
		List<String> list = new ArrayList<String>();
		list.add("황충연♡");
		list.add("윤상준");
		list.add("이재훈");
		list.add("김경태");
		list.add("박진호");
		
		return list;
	}//select

	
}
