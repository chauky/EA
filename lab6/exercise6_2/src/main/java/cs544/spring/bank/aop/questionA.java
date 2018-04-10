package cs544.spring.bank.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//@Aspect
public class questionA {
	
	
//	@Before("execution(* cs544.spring.bank.dao.*.*())")
	public void loggAllDao(JoinPoint joinPont) {
		
	
		Logger logger = Logger.getLogger(questionA.class.getName());
		logger.info("++++++++calling method : " + joinPont.getSignature().getName());
		
	}

}
