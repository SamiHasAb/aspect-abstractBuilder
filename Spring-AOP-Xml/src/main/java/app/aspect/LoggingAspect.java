package app.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import app.model.EmpDTO;

@Aspect
public class LoggingAspect {
	
	  @AfterReturning("execution(* app.service.EmpService.*(..))")
	    public void logAfterReturningAllMethods() throws Throwable 
	    {
	        System.out.println("****LoggingAspect.logAfterReturningAllMethods() ");
	    }
	 
	    @AfterReturning(pointcut="execution(* app.service.EmpService.getEmployeeById(..))", returning="retVal") 
	    public void logAfterReturningGetEmployee(Object retVal) throws Throwable 
	    {
	        System.out.println("****LoggingAspect.logAfterReturningGetEmployee() ");
	        System.out.println(((EmpDTO)retVal).getId());
	    }
	 
	    @AfterReturning("execution(* app.service.EmpService.createEmployee(..))")
	    public void logAfterReturningCreateEmployee() throws Throwable 
	    {
	        System.out.println("****LoggingAspect.logAfterReturningCreateEmployee() ");
	    }

}
