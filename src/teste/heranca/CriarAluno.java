package teste.heranca;

import infra.DAO;
import modelo.heranca.tipo2.Aluno;
import modelo.heranca.tipo2.AlunoBolsista;

public class CriarAluno {

	public static void main(String[] args) {
		
		DAO<Aluno> alunoDAO = new DAO<>();
		
		
		Aluno aluno1 = new Aluno(12L, "julio");
		AlunoBolsista aluno2 = new AlunoBolsista(34L, "pedro", 1000);
		
		alunoDAO.PersistirFULL(aluno2);
		alunoDAO.PersistirFULL(aluno1);
		
		
		alunoDAO.fechar();
	}
}
