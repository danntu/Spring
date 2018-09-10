package javatpoint.springaop.aspectannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
    @Pointcut("execution(* Operation.m*(..))")
    public void k() {
    }

    @Before("k()")
    public void myadvice(JoinPoint joinPoint) {
        System.out.println("additional concern");
    }
}
