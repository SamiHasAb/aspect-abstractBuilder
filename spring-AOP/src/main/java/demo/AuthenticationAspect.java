package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

		@Pointcut("within(demo..*)") // within all methods in all classes under demo package 
		public void authenticatingPointCut() {
			System.out.println("authenticatingPointCut");
		}  
		
		@Pointcut("within(demo.*)") 
		public void authorizationPointCut() {
			System.out.println("authorizationPointCut");
		}
		
		//calling the above point cuts
		@Before("authenticatingPointCut() && authorizationPointCut()")
		public void authenticate() {
			System.out.println("Authenticating the Request...");
		}
		
}
