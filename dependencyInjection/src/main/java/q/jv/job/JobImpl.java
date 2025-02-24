package q.jv.job;

import q.jv.dao.IDao;

public class JobImpl implements IJob{

    private IDao dao;
    @Override
    public double calc() {
        double temp = dao.getData();
        double res = temp * 58;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
