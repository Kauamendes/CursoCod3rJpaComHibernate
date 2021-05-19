package consultaTeste;

import java.util.List;
import consulta.Paciente;
import infra.DAO;

public class TesteListaConsultas {
	
	public static void main(String[] args) {
		
	

	DAO<Paciente> dao = new DAO<>(Paciente.class);
	List<Paciente> pacientes = dao.obterTodos();
	
	for(Paciente paciente1 : pacientes) {
		System.out.println("Nome paciente:  "+paciente1.getNome() + "\n");
				System.out.println("Idade Paciente:  " + paciente1.getIdade() + "\n");
				System.out.println("Horario Consulta:  "+paciente1.getHorarioConsulta() + "\n");
				System.out.println("Nome Medico:  "+paciente1.getMedico().getNome() + "\n");
				System.out.println("Especialização medico:  "+paciente1.getMedico().getEspecializacao() + "\n");
				System.out.println("------------------------------------------------------------------------------");
		} 
	}
} 
