package modelo.umpraum;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "albuns")
public class Album {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@MapsId
	@OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name="artista")
	private Artista artista;
	
	private String nome_album;
	
	private int numero_musicas;
	
	
	public Album() {
		
	}


	public Album(Artista artista, String nome_album, int numero_musicas) {
		super();
		this.artista = artista;
		this.nome_album = nome_album;
		this.numero_musicas = numero_musicas;
	}


	public Artista getArtista() {
		return artista;
	}


	public void setArtista(Artista artista) {
		this.artista = artista;
	}


	public String getNome_album() {
		return nome_album;
	}


	public void setNome_album(String nome_album) {
		this.nome_album = nome_album;
	}


	public int getNumero_musicas() {
		return numero_musicas;
	}


	public void setNumero_musicas(int numero_musicas) {
		this.numero_musicas = numero_musicas;
	}
	
	

	
	
}

	
	
	
	

