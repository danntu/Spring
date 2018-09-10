package javatpoint.emp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("src/test/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Employee employeeId = (Employee) factory.getBean("empwithId");
        employeeId.show();

        Employee employeeName = (Employee) factory.getBean("empwithName");
        employeeName.show();

        Employee employeeIdName = (Employee) factory.getBean("empwithIdName");
        employeeIdName.show();
    }
}
