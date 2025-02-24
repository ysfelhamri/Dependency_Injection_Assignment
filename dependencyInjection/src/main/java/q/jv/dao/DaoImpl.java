package q.jv.dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("1st Impl");
        double temp = 25;
        return temp;
    }
}
