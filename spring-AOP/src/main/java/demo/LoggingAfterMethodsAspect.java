package demo;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAfterMethodsAspect {
	

	//calling to log the return value via point cut

	
	//create point cut, with parameters or no b/c(..) it accept zero to many param
	@Pointcut("execution(* demo.ShoppingCart.quantity(..))")
	public void afterReturningPointCut() {
	} 
	
	//implement the point cut
	@AfterReturning(pointcut="afterReturningPointCut()", returning="returnValue")
	public void afterReturning(Object returnValue) {
		//returnValue is an int you can cast it to be a String or use an object
		System.out.println("After returning the value is :"+ returnValue);
	}


}
