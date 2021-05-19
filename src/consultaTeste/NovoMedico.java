package consultaTeste;

import consulta.Medico;
import infra.DAO;

public class NovoMedico {

	public static void main(String[] args) {
	
		Medico medico1 = new Medico("DR. Marcos", 33, "Clinico geral");
		DAO<Medico> dao = new DAO<>(Medico.class);
		dao.PersistirFULL(medico1);
		dao.fechar();

	}

}
