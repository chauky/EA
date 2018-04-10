package cs544.exercise6_1;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;

//@Aspect
public class LoggingAspect {
	Date date= new Date();
	
//	@After("execution(* cs544.exercise6_1.EmailSender.sendEmail(String,String)) && args(emailAddress, msg)")
	public void Logging(JoinPoint joinPoint, String emailAddress, String msg) {
		System.out.println(date + " method= " + joinPoint.getSignature().getName() + " address= "+emailAddress+" message= "+ msg);
		EmailSender emailSender = (EmailSender) joinPoint.getTarget();
		System.out.println("outgoing mail server = "+ emailSender.outgoingMailServer);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
