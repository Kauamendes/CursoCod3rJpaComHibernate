package consultaTeste;

import java.util.Date;

import consulta.Medico;
import consulta.Paciente;
import infra.DAO;

public class NovaConsulta {

	public static void main(String[] args) {
		
		Medico medico1 = new Medico("Dra.bruna ", 25, "clinica geral");
		Paciente paciente1 = new Paciente("pedro", 19, new Date(),medico1 );
		
		
		DAO<Paciente> dao = new DAO<>(Paciente.class);
		DAO<Medico> daoM = new DAO<>(Medico.class);
		
	
		dao.PersistirFULL(paciente1);
		daoM.PersistirFULL(medico1);
		dao.fechar();
	}

}
