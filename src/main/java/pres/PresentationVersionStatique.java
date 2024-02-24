package pres;

import dao.IDaoImpl;
import ext.IDaoImplV2;
import metier.IMetierImpl;

public class PresentationVersionStatique {
    public static void main(String[] args) {
        IDaoImplV2 dao = new IDaoImplV2();
        IMetierImpl metier = new IMetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Res = "+metier.calcul());

    }
}
