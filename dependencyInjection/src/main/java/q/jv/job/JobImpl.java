package q.jv.job;


import org.springframework.beans.factory.annotation.Autowired;
import q.jv.dao.IDao;
import org.springframework.stereotype.Component;

@Component("job")
public class JobImpl implements IJob{

    @Autowired
    private IDao dao;

    public JobImpl() {
    }

    public JobImpl(IDao dao) {
        this.dao = dao;
    }

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
