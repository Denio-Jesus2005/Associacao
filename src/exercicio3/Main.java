package exercicio3;

public class Main {
	
	public static void main(String[] args) {

		// criar 2 turmas
		Turma turma1 = new Turma(148, "Rodrigo Remor", 38);
		Turma turma2 = new Turma(39, "Gilberto", 25);

		// criar 3 alunos
		Aluno joao = new Aluno("João", 5, 18, null);
		Aluno jorge = new Aluno("Jorge", 0, 20, null);
		Aluno renato = new Aluno("Renato", 0, 17, null);

		// matricular os alunos
		turma1.matricularAluno(joao);
		turma2.matricularAluno(renato);
		turma1.matricularAluno(jorge);
		
		//listar os alunos de uma turma
		turma1.listarAlunos();
		turma2.listarAlunos();
		
		//listar a turma de um aluno
		joao.listarTurmas();
		jorge.listarTurmas();
		renato.listarTurmas();
	}
}