package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		Tio tia1 = new Tio("maria");
		Tio tio2 = new Tio("joão");
		
		Sobrinho sobrinho1 = new Sobrinho("Junior");
		Sobrinho sobrinho2 = new Sobrinho("Ana");
	
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		
		tia1.getSobrinhos().add(sobrinho2);
		sobrinho1.getTios().add(tia1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTrans()
		.persistir(tia1)
		.persistir(tio2)
		.persistir(sobrinho1)
		.persistir(sobrinho2)
		.abrirCommit()
		.fechar();
	}
}
