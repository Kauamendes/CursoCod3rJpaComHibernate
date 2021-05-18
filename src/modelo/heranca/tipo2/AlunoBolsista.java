package modelo.heranca.tipo2;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno{

	private double valordaBolsa;
	
	public AlunoBolsista() {}

	public AlunoBolsista(Long matricula, String nome ,double valordaBolsa) {
		super(matricula,nome);
		this.valordaBolsa = valordaBolsa;
	}

	public double getValordaBolsa() {
		return valordaBolsa;
	}

	public void setValordaBolsa(double valordaBolsa) {
		this.valordaBolsa = valordaBolsa;
	}
	
	
}
