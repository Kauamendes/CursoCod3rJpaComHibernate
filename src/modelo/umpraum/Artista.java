package modelo.umpraum;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="artistas")
public class Artista {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String artista;
	
	private String musica;
	
	@OneToOne(mappedBy = "artista", cascade = CascadeType.ALL,
			fetch = FetchType.LAZY, optional = true)
	private Album album;

	
	public Artista() {
		
	}


	public Artista(String artista, String musica) {
		super();
		this.artista = artista;
		this.musica = musica;
		
	}


	public String getNome() {
		return artista;
	}


	public void setNome(String artista) {
		this.artista = artista;
	}


	public String getMusica() {
		return musica;
	}


	public void setMusica(String musica) {
		this.musica = musica;
	}


	public Album getAlbum() {
		return album;
	}


	public void setAlbum(Album album) {
		this.album = album;
	}


}