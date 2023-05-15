package day0515.injection;

import java.util.List;
import java.util.Map;

/**
 * 다양한 의존성 주입
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
		System.out.println(" 문자열 의존성 주입 ");
	}//InjectionTest
	
	public InjectionTest(int age) {
		this.age = age;
		System.out.println("기본형(int) 의존성 주입");
	}//InjectionTest
	
	public InjectionTest(List<String> list) {
		this.list  = list;
		System.out.println("List 의존성 주입");
	}//InjectionTest
	
	public InjectionTest(Map<String, String> map) {
		this.map = map;
		System.out.println("Map 의존성 주입");
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
