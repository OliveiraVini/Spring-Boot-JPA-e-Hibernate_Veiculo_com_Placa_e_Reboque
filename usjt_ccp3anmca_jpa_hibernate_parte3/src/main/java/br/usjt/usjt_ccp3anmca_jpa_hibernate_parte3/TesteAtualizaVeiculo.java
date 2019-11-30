package br.usjt.usjt_ccp3anmca_jpa_hibernate_parte3;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteAtualizaVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = manager.find(Veiculo.class, 1L);
		v.setModelo(v.getModelo() + " Classic");
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
