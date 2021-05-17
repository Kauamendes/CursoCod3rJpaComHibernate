package TesteUmParaMuitos;

import infra.DAO;
import modelo.basico.Produto;
import modeloUmParaMuitos.ItemPedido;
import modeloUmParaMuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Geladeira" , 2889.99);
		ItemPedido item = new ItemPedido(10,pedido,produto);

		dao.abrirTrans()
			.persistir(produto)
			.persistir(pedido)
			.persistir(item)
			.abrirCommit()
			.fechar();
	}

}
