package day0515;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day0512.service.ServiceImpl;
import day0515.service.MethodService;

/**
 * SpringContainer ( ���� ���� : ( applicationContext.xml )�� �Է� �޾�
 * ���� ���� �ȿ� �ִ� <bean>���� ���� �ֱ⸦ �����ϰ�(��ü �����ϰ�) ������ ������ �����ϴ� �� )
 * @author user
 *
 */
public class UseSpringContainer {

	public static void main(String[] args) {
		
		//SpringContainer ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0515/applicationContext.xml");
		
		//SpringContainter���� bean ���
		ServiceImpl si =  ac.getBean(ServiceImpl.class);
		
		//Service ��ü�� �����ϴ� ����� ���
		si.add("�׽�Ʈ");
		System.out.println(si.search());
		//MethodService.class => ��? getBean(ã�� Ŭ���� ����) byte �ڵ�
		
		// Ŭ������ �־� ��ü�� ã�� �Ҵ�
		//MethodService ms = ac.getBean(MethodService.class); ��ü ���� SpringContainer
		
		//���̵� ������ ��ü�� ã�� > �θ�� ���ͼ� > �ڽ����� ��ȯ�� ���� �Ҵ� => ����
		MethodService ms = (MethodService)ac.getBean("ms");
		
		ms.add("�׽�Ʈ2");
		System.out.println(ms.search());
		
	}//main
	
}//class
