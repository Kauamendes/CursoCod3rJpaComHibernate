package teste.consultas;

import java.util.List;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filmes;

public class ObterFilmes {

	public static void main(String[] args) {
		
		DAO<Filmes> dao = new DAO<> (Filmes.class);
		List<Filmes> filmes = dao.consultar(
				"obterFilmesComNotaMaiorQue", "nota", 8.5);
		
		for(Filmes filmesA: filmes) {
			System.out.println(filmesA.getNome() 
					+ "--> "  +filmesA.getNota());
			
		for(Ator ator: filmesA.getAtores()) {
			System.out.println(ator.getNome());
		}
		
	 }	
		
   }
	
}
