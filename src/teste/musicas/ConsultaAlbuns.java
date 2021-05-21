package teste.musicas;

import java.util.List;

import infra.DAO;
import modelo.umpraum.Album;

public class ConsultaAlbuns {

	public static void main(String[] args) {
	
		DAO<Album> dao = new DAO<>(Album.class);
		List<Album> albuns = dao.obterTodos();
		
		for(Album album: albuns) {
		
			System.out.println("Nome do artista: " + album.getArtista().getNome()); 
			System.out.println("Numero de musicas: " + album.getNumero_musicas());
			System.out.println("Nome do album: " + album.getNome_album());
		}

	}

}
