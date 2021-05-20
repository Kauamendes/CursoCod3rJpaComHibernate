package DAO;

import java.util.Date;

import consulta.Medico;
import consulta.Paciente;
import infra.DAO;

public class NovaConsultaDAO {

	public static void main(String[] args) {
		

	Medico medico2 = new Medico("Dr.Erik", 39, "Infectologista");
	Paciente paciente2 = new Paciente("Felipe", 25, new Date(),medico2);
	
	DAO<Paciente> dao = new DAO<>(Paciente.class);
	DAO<Medico> daoM = new DAO<>(Medico.class);
	
	dao.PersistirFULL(paciente2);
	daoM.PersistirFULL(medico2);
	
		
	} 
}
