package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeRunner {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring-as-prototype.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.drawWithHeight();
	}

}
