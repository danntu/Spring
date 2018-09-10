package javatpoint.springaop.aspectannotation.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
    @Pointcut("execution(* Operation.m*(..))")
    public void k() {
    }

    @After("k()")
    public void myadvice(JoinPoint joinPoint) {
        System.out.println("additional concern after");
    }
}
