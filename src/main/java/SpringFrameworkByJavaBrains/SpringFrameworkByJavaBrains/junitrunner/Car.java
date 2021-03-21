package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.junitrunner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public void getCarInSimpleCarClass(){
		System.out.println("SimpleCarClass --> getCarInSimpleCarClass");
	}
	
	@PostConstruct
	public void start(){
		System.out.println("Car is starting");
	}
	
	@PreDestroy
	public void stop(){
		System.out.println("Car stopped");
	}
	
}
