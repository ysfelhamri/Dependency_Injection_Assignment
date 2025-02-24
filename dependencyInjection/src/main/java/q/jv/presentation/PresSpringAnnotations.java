package q.jv.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import q.jv.job.IJob;

public class PresSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("q.jv.job","q.jv.dao");
        IJob job = context.getBean(IJob.class);
        System.out.println(job.calc());
    }
}
