package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.constructAndDestrory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(MyConfiguration.class);
		ctx.refresh();

		MyBean mb1 = ctx.getBean(MyBean.class);
		System.out.println(mb1.hashCode());

		MyBean mb2 = ctx.getBean(MyBean.class);
		System.out.println(mb2.hashCode());

		ctx.close();
	}

}
