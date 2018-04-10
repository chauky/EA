package cs544.spring.bank.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;

@Aspect
public class questionB {
	 @Around("execution(* cs544.spring.bank.service.*.*(..))")
		public Object invoke(ProceedingJoinPoint call) throws Throwable {
			StopWatch sw = new StopWatch();
			sw.start(call.getSignature().getName());
			Object retVal = call.proceed();
			sw.stop();
			long totaltime = sw.getLastTaskTimeMillis();
			System.out.println("===================Time to execute save ================== "+totaltime);
			
			return retVal;
			}
}
