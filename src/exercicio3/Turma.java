package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	// atributos
	private int numero;
	private String paraninfo;
	private int quantidadeDeAlunos;
	private ArrayList<Aluno> alunosMatriculados;

	// construtores sem parâmetros
	public Turma() {
		this.numero = 0;
		this.paraninfo = "";
		this.quantidadeDeAlunos = 0;
		this.alunosMatriculados = new ArrayList<>();
	}

	// construtores com parâmetros
	public Turma(int numero, String paraninfo, int quantidadeDeAlunos) {
		this.numero = numero;
		this.paraninfo = paraninfo;
		this.quantidadeDeAlunos = quantidadeDeAlunos;
		this.alunosMatriculados = new ArrayList<>();
	}

	// métodos
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getParaninfo() {
		return paraninfo;
	}

	public void setParaninfo(String paraninfo) {
		this.paraninfo = paraninfo;
	}

	public int getQuantidadeDeAlunos() {
		return quantidadeDeAlunos;
	}

	public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
		this.quantidadeDeAlunos = quantidadeDeAlunos;
	}

	public List<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public void setAlunosMatriculados(ArrayList<Aluno> alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}

	public void matricularAluno(Aluno aluno) {
		alunosMatriculados.add(aluno);
		aluno.adicionarTurma(this);
	}

	public void listarAlunos() {
		System.out.println("Alunos matriculados da turma " + numero + ":");
		for (Aluno aluno : alunosMatriculados) {
			System.out.println(aluno.getNome());
		}
	}
}
