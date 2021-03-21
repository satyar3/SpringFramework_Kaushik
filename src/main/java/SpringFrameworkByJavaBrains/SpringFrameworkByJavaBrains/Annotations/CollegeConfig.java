package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
/*
@ComponentScan(basePackages="SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.Annotations")
//@ComponentScan is required only when there is @Component present inside the college class
*/

@PropertySource("classpath:college-details.properties")
public class CollegeConfig {

	@Bean(name="principalBean")
	public Principal principalBean(){
		Principal principal = new Principal();
		return principal;
	}
	
	@Bean(name="teacherlBean")
	public Teacher teacherlBean(){
		Teacher teacher = new MathTeacher();
		return teacher;
	}
	
	
	@Bean(name="collegeBean")
	//The function name will be the bean ID or bean Name if the "Name" parameter is not provided
	//The @Bean annotation is another way to define the bean without using @component or defining inside the config xml
	public College collegeBean(){
		
		//For Constructor injection
		//College college = new College(principalBean());
		
		
		//For setter injection
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(teacherlBean());
		return college;
	}
	
}
