package day0515;

public class Singleton {
	private static Singleton single;
	
	private Singleton() {
		System.out.println("private ������");
	}//Singleton
	
	public static Singleton getInstance() {
		if(single == null) {
			single = new Singleton();
		}//end if
		System.out.println("getInstance factory-method �Ӽ����� ȣ��ȴ�. ");
		return single;
	}//getInstance
	
	
}//class
