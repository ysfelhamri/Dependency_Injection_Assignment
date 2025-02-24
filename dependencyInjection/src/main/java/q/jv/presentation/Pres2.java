package q.jv.presentation;


import q.jv.dao.IDao;
import q.jv.job.IJob;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("config"));
            String daoClassName = sc.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.getConstructor().newInstance();

            String jobClassName = sc.nextLine();
            Class cJob = Class.forName(jobClassName);
            IJob job = (IJob) cJob.getConstructor(IDao.class).newInstance(dao);

            System.out.println(job.calc());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
