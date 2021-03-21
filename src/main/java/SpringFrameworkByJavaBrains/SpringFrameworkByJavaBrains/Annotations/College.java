package SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.Annotations;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * 
 * Way--> 1
@Component("collegebean") // -> Same as 

 <bean id="collegebean" class="SpringFrameworkByJavaBrains.SpringFrameworkByJavaBrains.Annotations.College">
 </bean>
 *
 *The above snippet will help you to create the object of College class
 *
 *The class name in lower case will be the bean ID or bean Name if the "Name" parameter is not provided in @component
 */



public class College {
	
	//Hard coding the college name
	//@Value("COLLEGE--NAME")	
	
	
	private String collegeName;
	private Principal principal;
	private Teacher teacher;
	
	/*
	 * Used for contructor injections
	 * public College(Principal principal){
		this.principal = principal;
	}*/
	

	public College(){
		System.out.println("Inside : College : no-args constructer");
	}
	
	public Principal getPrincipal() {
		return principal;
	}

	//Make the field as mandatory
	@Required
	
	//Get college Name value from property file
	@Value("${college.name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}

	//@Autowired --> is required when instead of @Bean, @component is defined, then in tact case to inject the objects 
	//during runtime, we need @Autowired
	//if @AutoWired is defined at the data member level i.e at the variable level, then we don't need setter methods
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}	
	
	public void test(){
		System.out.println("My College Name is :: "+getCollegeName());
		principal.principalFun();
		teacher.teach();
	}
	
	@PostConstruct
	public void printPostConstructBody(){
		System.out.println("Inside : printPostConstructBody");
	}
}
