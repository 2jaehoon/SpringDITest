package day0515.service;

import java.sql.SQLException;
import java.util.List;

import day0512.dao.DAO;

public class MethodService {

	private DAO dao;
	public MethodService() {
		System.out.println("MethodService의 기본 생성자");
	}
	
	public DAO getDao() {
		return dao;
	}
	
	public void setDao(DAO dao) {
		this.dao = dao;
		System.out.println("setDao 호출");
	}
	
	public void add(String name) {
		try {
			dao.insert(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
	}//add
	
	public List<String> search(){
		List<String> list = null;
		
		try {
			list=dao.select();
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
		return list;
	}//search
	
	
}
