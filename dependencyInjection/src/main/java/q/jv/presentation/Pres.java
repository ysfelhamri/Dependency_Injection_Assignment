package q.jv.presentation;


import q.jv.dao.DaoImpl;
import q.jv.job.JobImpl;

public class Pres {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        JobImpl job = new JobImpl();
        job.setDao(dao);
        System.out.println(job.calc());
    }
}