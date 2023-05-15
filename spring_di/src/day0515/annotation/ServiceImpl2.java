package day0515.annotation;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import day0512.dao.DAO;

@Component
public class ServiceImpl2 implements Service {
	@Autowired
	private OracleDAOImpl dao;
	

	@Override
	public void add(String name) {
		try {
			dao.insert(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
	}//add


	@Override
	public List<String> search() {
		List<String> list = null;
		
		try {
			list=dao.select();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}//search


}
