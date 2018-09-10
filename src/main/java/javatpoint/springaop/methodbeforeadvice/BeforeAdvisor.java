package javatpoint.springaop.methodbeforeadvice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvisor implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("additional concern before actual logic");
        System.out.println("method info: " + method.getName() + " " + method.getModifiers());
        System.out.println("argument info");
        for (Object args : objects)
            System.out.println(args);
        System.out.println("target Object:" + o);
        System.out.println("target object class name: " + o.getClass().getName());
    }
}
