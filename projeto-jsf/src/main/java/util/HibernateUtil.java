package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	
private static EntityManagerFactory factory;
	
	static  {
		//factory = Persistence.createEntityManagerFactory("projeto-jsf");
		factory = Persistence.createEntityManagerFactory("d98dc69o74d070");
	}
	
		
	public static EntityManager getEntityManager() {
		return factory.createEntityManager(); //provê a persistencia
	}
	
	public static Object getPrimaryKey(Object entidade) {
		return factory.getPersistenceUnitUtil().getIdentifier(entidade);
	}

}
