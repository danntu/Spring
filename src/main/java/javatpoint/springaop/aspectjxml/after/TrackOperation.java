package javatpoint.springaop.aspectjxml.after;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
    public void myadvice(JoinPoint joinPoint) {
        System.out.println("additional concern");
    }
}
