package app.service;

import java.util.ArrayList;
import java.util.List;

import app.model.EmpDTO;

public class EmpService {
	
	
	 public EmpDTO getEmployeeById(Integer employeeId) 
	    {
	        System.out.println("Method getEmployeeById() called");
	        return new EmpDTO();
	    }
	 
	    public List<EmpDTO> getAllEmployee() 
	    {
	        System.out.println("Method getAllEmployee() called");
	        return new ArrayList<EmpDTO>();
	    }
	 
	    public void createEmployee(EmpDTO employee)
	    {
	        System.out.println("Method createEmployee() called");
	    }
	 
	    public void deleteEmployee(Integer employeeId) 
	    {
	        System.out.println("Method deleteEmployee() called");
	    }
	 
	    public void updateEmployee(EmpDTO employee) 
	    {
	        System.out.println("Method updateEmployee() called");
	    }

}
