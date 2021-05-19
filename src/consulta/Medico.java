package consulta;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="medicos")
public class Medico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private int idade;
	
	@Column
	private String especializacao ;
	
	@OneToOne(mappedBy = "medico")
	private Paciente paciente;


public Medico() {
	
}


public Medico(String nome, int idade, String especializacao) {
	super();
	this.nome = nome;
	this.idade = idade;
	this.especializacao = especializacao;
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


public String getEspecializacao() {
	return especializacao;
}


public void setEspecializacao(String especializacao) {
	this.especializacao = especializacao;
}


public Paciente getPaciente() {
	return paciente;
}


public void setPaciente(Paciente paciente) {
	this.paciente = paciente;
}



}
