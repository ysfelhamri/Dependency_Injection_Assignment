package q.jv.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import q.jv.job.IJob;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IJob job = context.getBean(IJob.class);
        System.out.println(job.calc());
    }
}
