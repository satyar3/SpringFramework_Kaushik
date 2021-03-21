package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		/*
		//With config xml
		ApplicationContext contextWithConfigXml = new ClassPathXmlApplicationContext("spring-as-annotations.xml");
		*/
		
		/*//Without config xml and with @component
		ApplicationContext contextWithOutConfigXml = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = contextWithOutConfigXml.getBean("collegebean",College.class);
		college.test();
		*/
		
		//Without config xml and @component but with @bean
		ApplicationContext contextWithOutConfigXml = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = contextWithOutConfigXml.getBean("collegeBean",College.class);
		college.test();
		
		((AnnotationConfigApplicationContext)contextWithOutConfigXml).close();

		
	}

}
