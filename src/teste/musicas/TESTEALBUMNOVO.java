package teste.musicas;

import infra.DAO;
import modelo.umpraum.Album;
import modelo.umpraum.Artista;

public class TESTEALBUMNOVO {

	public static void main(String[] args) {
	
		
		Artista artista1 = new Artista("Xamã", "Era uma vez");
		Album album1 = new Album(artista1, "O iluminado ", 10);
		
		DAO<Artista> daoA = new DAO<>(Artista.class);
		DAO<Album> daoB = new DAO<>(Album.class);
		
				
		daoB.PersistirFULL(album1);
		daoA.PersistirFULL(artista1);
		daoA.fechar();
		daoB.fechar();
		
	}

}
