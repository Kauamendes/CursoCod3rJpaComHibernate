package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {
		
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Usuario usuario = em.find(Usuario.class, 8L);
		
		if(usuario != null) {
			em.remove(usuario);
			em.getTransaction().begin();
			em.getTransaction().commit();
		}
		
		em.close();
		emf.close();
		
	}
}
