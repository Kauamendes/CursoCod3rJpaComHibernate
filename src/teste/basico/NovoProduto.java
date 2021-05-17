package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
	
		DAO<Produto> dao = new DAO<> (Produto.class);

		Produto produto =  new Produto ("Monitor 23", 789.98);
		dao.PersistirFULL(produto).fechar();
		
		System.out.println("Id do produto: " +produto.getId());
	}

}
