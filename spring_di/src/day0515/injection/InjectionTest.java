package day0515.injection;

import java.util.List;
import java.util.Map;

/**
 * �پ��� ������ ����
 * @author user
 *
 */
public class InjectionTest {
	private String name;
	private int age;
	
	private List<String> list;
	private Map<String, String> map;
	
	public InjectionTest( String name ) {
		this.name = name;
		System.out.println(" ���ڿ� ������ ���� ");
	}//InjectionTest
	
	public InjectionTest(int age) {
		this.age = age;
		System.out.println("�⺻��(int) ������ ����");
	}//InjectionTest
	
	public InjectionTest(List<String> list) {
		this.list  = list;
		System.out.println("List ������ ����");
	}//InjectionTest
	
	public InjectionTest(Map<String, String> map) {
		this.map = map;
		System.out.println("Map ������ ����");
	}//InjectionTest

	public String getName() {
		return name;
	}//getName

	public int getAge() {
		return age;
	}//getAge

	public List<String> getList() {
		return list;
	}//getList

	public Map<String, String> getMap() {
		return map;
	}//getMap


	

}
