package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.junitrunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configurations.class, loader = AnnotationConfigContextLoader.class)
public class JUnitRunner {
	
	@Autowired
	Car simpleCarClass;
	
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void main() {
		simpleCarClass.getCarInSimpleCarClass();
	}
}
