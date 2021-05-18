package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filmes;

public class NovoFilmeAtor {

	public static void main(String[] args) {
	
		Filmes filmeA = new Filmes("Jack Reacher", 8.0);
		Filmes filmeB = new Filmes("Velozes e Furiozos", 7.5);
		
		Ator atorA = new Ator("Tom Cruise");
		Ator atrizB = new Ator("Ana Seila");	
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filmes> dao = new DAO<Filmes>();
	    dao.PersistirFULL(filmeA);
		

	}

}
