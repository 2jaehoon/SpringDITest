package day0512.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLDAOImpl implements DAO{
	
	 public MySQLDAOImpl() {
		 System.out.println("MySQLDAOImpl 기본 생성자");
	}

	@Override
	public void insert(String name) throws SQLException {
		System.out.println("MySQL dbms에 insert 작업");
		
	}//insert

	@Override
	public List<String> select() throws SQLException {
		List<String> list = new ArrayList<String>();
		list.add("김규미");
		list.add("모민경");
		list.add("김보경");
		list.add("정다현");
		list.add("이은혜");
		list.add("이미현");
		
		return list;
	}//select

	
}
