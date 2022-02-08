package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* demo.ShoppingCart.checkout())")
	// this will be called before checkout and the * is the return type ie any types
	public void beforeLogger(JoinPoint jp) {

		System.out.println("the signature or method is : " + jp.getSignature());
		System.out.println("Before loggers method from Logging Aspect is called...");
	}

	@After("execution(*  *.*.checkout())") // *.* any package.any class .checkout method
	public void afterLogger() {
		System.out.println("After logger method from Logging Aspect is called...");
		System.out.println();
	}

	
	
	// aspect for the methods with parameters

	
	
	@Before("execution(* demo.ShoppingCart.checkoutWithParam(..))") // .. for the any number of parameters
	public void beforeLoggerWithParam(JoinPoint jp) {

		System.out.println("the signature or method is : " + jp.getSignature());
		System.out.println("the arguments is " + jp.getArgs()[0].toString());
		System.out.println("Before loggers WithParam method from Logging Aspect is called...");
	}

	@After("execution(*  *.*.checkoutWithParam(..))")
	public void afterLoggerWithParam() {
		System.out.println("After logger WithParam method from Logging Aspect is called...");
		System.out.println();
	}
}
