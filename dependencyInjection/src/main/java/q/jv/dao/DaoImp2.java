package q.jv.dao;

public class DaoImp2  implements IDao{

    @Override
    public double getData() {
        System.out.println("2ns Impl");
        double temp = 30;
        return temp;
    }
}