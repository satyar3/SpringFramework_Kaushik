package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.propertyAsObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectBeanRunner {

	public static void main(String[] args) {

		// Using application context
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring-as-objects.xml");
		//Triangle hexagon = (Triangle) factory.getBean("triangle"); // ID of the triangle given in the spring.xml
		//Triangle hexagon = (Triangle) factory.getBean("triangle-inline-alias"); 
		Triangle hexagon = (Triangle) factory.getBean("triangle-alias");
		hexagon.draw();
	}

}
