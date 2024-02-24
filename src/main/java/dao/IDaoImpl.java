package dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double temp = 23;
        return temp;
    }
}
