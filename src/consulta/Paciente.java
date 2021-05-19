package consulta;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Pacientes")
public class Paciente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private int idade;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date horarioConsulta;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="medico_id", unique = true)
	private Medico medico;
	
	
	
	public Paciente() {
		
	}



	public Paciente(String nome, int idade, Date horarioConsulta, Medico medico) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.horarioConsulta = horarioConsulta;
		this.medico = medico;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getHorarioConsulta() {
		return horarioConsulta;
	}

	public void setHorarioConsulta(Date horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}



	public Medico getMedico() {
		return medico;
	}



	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
}
