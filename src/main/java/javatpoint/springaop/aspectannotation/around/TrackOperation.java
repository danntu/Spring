package javatpoint.springaop.aspectannotation.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
    @Pointcut("execution (* Operation.*(..))")
    public void abcPointcut() {
    }

    @Around("abcPointcut()")
    public Object myadvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Additional Concern Before calling actual method");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("Additional Concern After calling actual method");
        return obj;
    }
}
