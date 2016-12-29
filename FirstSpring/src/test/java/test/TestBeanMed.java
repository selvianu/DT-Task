package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.niit.bean.Medicine;

public class TestBeanMed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// AddMedicine ad=new AddMedicines();

		// MedicineDAO m = new MedicineDAO();
		Medicine m = new Medicine();
		String persistenceUnitName = "sessionFactory";
		
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(m);
		tx.commit();
		em.close();
		System.out.println(m);
	}

}
