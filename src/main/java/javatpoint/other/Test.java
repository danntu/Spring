package javatpoint.other;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        Resource resource = new ClassPathResource("applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        Student student = (Student) factory.getBean("studentBean");
//        student.displayInfo();

        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student2 = (Student) context2.getBean("studentBean");
        student2.displayInfo();

//        ApplicationContext context3 = new AnnotationConfigApplicationContext(AppContext.class);
//        Student student3 = context3.getBean(Student.class);
//        student3.setName("Danik with annotation");
//        student3.setAge(32);
//        student3.displayInfo();


    }
}
