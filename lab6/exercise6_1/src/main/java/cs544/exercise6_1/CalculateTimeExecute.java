package cs544.exercise6_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;

@Aspect
public class CalculateTimeExecute {
	
    @Around("execution(public * cs544.exercise6_1.CustomerDAO.save(..))")
	public Object invoke(ProceedingJoinPoint call) throws Throwable {
		StopWatch sw = new StopWatch();
		sw.start(call.getSignature().getName());
		Object retVal = call.proceed();
		sw.stop();
		long totaltime = sw.getLastTaskTimeMillis();
		System.out.println("Time to execute save = "+totaltime);
		
		return retVal;
		}

}
