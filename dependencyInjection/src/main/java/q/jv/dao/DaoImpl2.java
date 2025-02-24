package q.jv.dao;

public class DaoImpl2 implements IDao{

    @Override
    public double getData() {
        System.out.println("2nd Impl");
        double temp = 30;
        return temp;
    }
}