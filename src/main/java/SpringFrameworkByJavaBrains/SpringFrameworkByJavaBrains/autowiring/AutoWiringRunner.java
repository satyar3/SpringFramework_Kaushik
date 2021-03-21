package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringRunner {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring-as-autowiring.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
	}

}
