package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.niit.bean.Candidate;

public class TestBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Candidate c = new Candidate();
		c.setId(44);
		c.setName("dfd");
		c.setEmailId("csenaresh@gmail.com");
		c.setPassword("45454");
		System.out.println(c);
		String persistenceUnitName = "sessionFactory";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(c);
		tx.commit();
		em.close();
	}

}
