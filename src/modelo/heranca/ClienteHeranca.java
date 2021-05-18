package modelo.heranca;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="clientes_heranca")
public class ClienteHeranca extends Pessoa{

	@Column(length = 20, nullable = false)
	private String login;
	
	@Column(length = 20, nullable = false)
	private String senha;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
