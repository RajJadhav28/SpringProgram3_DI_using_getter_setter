package in.quastech.resource;

import org.springframework.context.annotation.Bean;

import in.quastech.bean.Address;
import in.quastech.bean.Employees;

public class SpringConfigFile {
	@Bean
	Address addObj() {
		Address add=new Address();
		add.setLoc("Ghatkopar");
		add.setPin(421306);
		return add;	
	}
	
	@Bean
	Employees empObj() {
		Employees emp=new Employees();
		emp.setEmpId(101);
		emp.setEmpname("RAJ");
		emp.setAdd(addObj());
		return emp;
		
	}
	

}
