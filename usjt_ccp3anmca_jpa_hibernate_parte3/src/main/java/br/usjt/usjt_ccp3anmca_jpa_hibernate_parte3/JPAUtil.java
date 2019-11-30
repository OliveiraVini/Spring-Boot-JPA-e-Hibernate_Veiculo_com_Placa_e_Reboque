package br.usjt.usjt_ccp3anmca_jpa_hibernate_parte3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	
	//bloco inicializador estático
	static {
		factory = Persistence.createEntityManagerFactory("asstiPU");
	}
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	public static void close() {
		factory.close();
	}

}
