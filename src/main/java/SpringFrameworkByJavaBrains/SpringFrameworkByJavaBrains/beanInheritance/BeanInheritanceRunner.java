package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.beanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInheritanceRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-as-beaninheritance.xml");
		Triangle triangle = (Triangle) context.getBean("triangle1");
		triangle.draw();

	}

}
