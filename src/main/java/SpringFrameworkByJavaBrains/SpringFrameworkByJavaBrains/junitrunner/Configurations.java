package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.junitrunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {
	
	@Bean
	public Car getBeanOfsimpleCarClass(){
		return new Car();
	}

}
