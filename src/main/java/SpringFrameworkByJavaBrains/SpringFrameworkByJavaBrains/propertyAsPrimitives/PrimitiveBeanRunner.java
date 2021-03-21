package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.propertyAsPrimitives;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class PrimitiveBeanRunner {
	
	public static void main(String[] args) {
		
		/*
		//Without using spring
		Traingle traingle = new Traingle();
		*/
				
		//Using Spring
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src\\main\\resources\\spring.xml"));
		
		//Using application context
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring-as-premitives.xml");
		Triangle traingle = (Triangle) factory.getBean("triangle"); //ID of the Triangle given in the spring.xml
		traingle.draw();
		traingle.drawWithHeight();
		
	}

}
