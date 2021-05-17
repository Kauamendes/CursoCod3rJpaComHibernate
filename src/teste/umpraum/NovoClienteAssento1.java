package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {

		Assento assento = new Assento("69C");
		Cliente cliente = new Cliente("jair" ,assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTrans()
		.persistir(assento)
		.persistir(cliente)
		.abrirCommit()
		.fechar();
	}

}
