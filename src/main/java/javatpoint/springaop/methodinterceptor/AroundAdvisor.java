package javatpoint.springaop.methodinterceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object obj = null;

        System.out.println("additional concern before actual logic");
        methodInvocation.proceed();
        System.out.println("additional concern after actual logic");
        return obj;
    }
}
