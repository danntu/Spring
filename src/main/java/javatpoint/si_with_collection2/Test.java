package javatpoint.si_with_collection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src/test/applicationContext.xml");
        Question question = (Question) context.getBean("questionlist2");
        question.displayInfo();
    }
}
