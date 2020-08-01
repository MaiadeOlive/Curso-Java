package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.People;

public class Program {

	public static void main(String[] args) {

//		People p1 = new People(null, "Carlos da Silva", "carlos@gmail.com");
//		People p2 = new People(null, "Eliana Souto", "eliana@gmail.coma");
//		People p3 = new People(null, "Cynthia Lima", "cynthia@gmail.com");
		People p4 = new People(null, "José Nelson", "nelson@gmil.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
		em.persist(p4);

		People p = em.find(People.class, 4);
		System.out.println("Pessoa: " + p);
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Pessoa Removida!");

		System.out.println("Pronto!");

		em.close();
		emf.close();
	}
}
