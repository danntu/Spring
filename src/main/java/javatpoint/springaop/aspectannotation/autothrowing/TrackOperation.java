package javatpoint.springaop.aspectannotation.autothrowing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackOperation {
    @AfterThrowing(
            pointcut = "execution (* Operation.*(..))",
            throwing = "error"
    )
    public void myadvice(JoinPoint joinPoint, Throwable error) {
        System.out.println("additional concern");
        System.out.println("Method Signature: " + joinPoint.getSignature());
        System.out.println("Exception is: " + error);
        System.out.println("end of after throwing advice...");
    }
}
