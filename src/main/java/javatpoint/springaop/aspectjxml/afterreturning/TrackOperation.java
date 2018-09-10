package javatpoint.springaop.aspectjxml.afterreturning;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
    public void myadvice(JoinPoint joinPoint, Object result) {
        System.out.println("additional concern");
        System.out.println("Method Signature: " + joinPoint.getSignature());
        System.out.println("Result in advice: " + result);
        System.out.println("end of after returning advice...");
    }
}
