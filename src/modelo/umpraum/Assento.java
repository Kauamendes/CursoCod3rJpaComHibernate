package modelo.umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="assentos")
public class Assento {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String Nome;
	
	@OneToOne(mappedBy = "assento")
	private Cliente cliente;
	
	public Assento() {
		
	}

	public Assento(String nome) {
		super();
		Nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliene(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}

