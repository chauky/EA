package cs544.spring.bank.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//@Aspect
public class questionC {
	
	Logger log = Logger.getLogger(questionC.class.getName());
	
//	@Before("execution(* cs544.spring.bank.jms.*.*(..))")
	public void Log(JoinPoint joinPoint) {
		log.info("====================This method is executed=====================: " + joinPoint.getSignature().getName());
	}

}
