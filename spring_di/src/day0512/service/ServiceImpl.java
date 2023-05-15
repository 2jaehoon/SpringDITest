package day0512.service;

import java.sql.SQLException;
import java.util.List;

import day0512.dao.DAO;

public class ServiceImpl implements Service {
	private DAO dao;
	
	/**
	 * dao를 의존성 주입 받는 생성자
	 * serviceimpl과 dao는 약결합 관계
	 * @param dao
	 */
	public ServiceImpl(DAO dao) {
		this.dao=dao;
		System.out.println("ServiceImpl의 인자있는 생성자");
	}//ServiceImpl

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
