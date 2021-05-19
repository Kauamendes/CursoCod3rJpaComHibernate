package infra;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import consulta.Paciente;


public class DAO<E>{

	private static EntityManagerFactory emf ;
	private EntityManager em;
	private Class<E> classe;
	
	static {
			try {
				emf = Persistence.createEntityManagerFactory("PU");
			} catch (Exception E) {
				//logat -> logj4
			}
	}
	
	public DAO() {
		this(null);
	}

	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> abrirTrans() {
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> abrirCommit() {
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> persistir(E entidade) {
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> PersistirFULL(E entidade) {
	
		return this.abrirTrans().persistir(entidade).abrirCommit();
	}
	
	public E obterPorID(Object id) {
		return em.find(classe, id);
	}
	
	
	public List<E> obterTodos() {
		return this.obterTodos(10, 0);
	}
	
	
	public List<E> obterTodos(int quant, int deslocamento) {
		
		if(classe== null) {
			throw new UnsupportedOperationException("Classe nula.");
		}
		
		String jpql = "select e from " +classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql , classe);
		query.setMaxResults(quant);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	public List<E> consultar(String nomeConsulta, Object...params) {
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		
		for(int i = 0; i < params.length; i += 2) {
			query.setParameter(params[i].toString(), params[i + 1]);
			
		}
		return query.getResultList();
		
	}
	
	public E consultarUm(String nomeConsulta, Object...params) {
		List<E> lista = consultar(nomeConsulta, params);
		return lista.isEmpty() ? null : lista.get(0);
	}
	
	public void fechar() {
		em.close();
	}
	
}
