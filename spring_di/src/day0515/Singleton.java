package day0515;

public class Singleton {
	private static Singleton single;
	
	private Singleton() {
		System.out.println("private 생성자");
	}//Singleton
	
	public static Singleton getInstance() {
		if(single == null) {
			single = new Singleton();
		}//end if
		System.out.println("getInstance factory-method 속성으로 호출된다. ");
		return single;
	}//getInstance
	
	
}//class
