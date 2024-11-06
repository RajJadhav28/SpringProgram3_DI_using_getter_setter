package in.quastech.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import in.quastech.bean.Employees;
import in.quastech.resource.SpringConfigFile;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Employees emp=(Employees)context.getBean("empObj");
		emp.display();

	}

}
