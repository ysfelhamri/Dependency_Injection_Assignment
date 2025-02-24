package q.jv.job;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import q.jv.dao.IDao;

@Service("metier")
public class JobImpl implements IJob{

    private IDao dao;

    public JobImpl() {
    }

    public JobImpl(@Qualifier("dao2") IDao dao) {
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
