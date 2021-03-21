package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.applicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextAwareRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-as-contextaware.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
