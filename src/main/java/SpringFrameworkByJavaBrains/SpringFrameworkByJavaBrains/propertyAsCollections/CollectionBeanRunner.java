package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.propertyAsCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionBeanRunner {

	public static void main(String[] args) {

		// Using application context
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring-as-collections.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
	}

}
