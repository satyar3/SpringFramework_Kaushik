package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.constructAndDestrory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	public MyBean() {
		System.out.println("MyBean instance created");
	}

	@PostConstruct
	private void init() {
		System.out.println("Verifying Resources");
	}

	@PreDestroy
	private void shutdown() {
		System.out.println("Shutdown All Resources");
		System.out.println("Pre destroy completed");
	}

	public void close() {
		System.out.println("Closing All Resources");
	}

}
