package teste.musicas;

import infra.DAO;
import modelo.umpraum.Album;
import modelo.umpraum.Artista;

public class TESTEALBUMNOVO {

	public static void main(String[] args) {
	
		
		Artista artista1 = new Artista("L7NNON" , "Nada e pra sempre");
		Album album1 = new Album(artista1 ,"Hip Hop Hare",10);
		
		DAO<Artista> daoA = new DAO<>(Artista.class);
		DAO<Album> daoB = new DAO<>(Album.class);
				
		
		daoA.PersistirFULL(artista1);
		daoB.PersistirFULL(album1);
		daoA.fechar();
		daoB.fechar();

	}

}
