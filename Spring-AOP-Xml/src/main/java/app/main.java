package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.model.EmpDTO;
import app.service.EmpService;

public class main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmpService manager = (EmpService) context.getBean("employeeService");
  
        manager.getEmployeeById(1);
        manager.createEmployee(new EmpDTO());
	}

}
