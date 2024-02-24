package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class IMetierImpl implements IMetier {
    private IDao dao;

    public IMetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData() * 23;
        return t;
    }
}
