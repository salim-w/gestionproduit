package h1;

import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate ;

public class H1 {

    public static void main(String[] args) {
      HibernateUtil.getSessionFactory().openSession();
    }
    
}
