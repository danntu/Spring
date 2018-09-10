package javatpoint.springaop.aspectjxml;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
    public void myadvice(JoinPoint joinPoint) {
        System.out.println("additional concern");
    }
}
