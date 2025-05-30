package exercicio3;

import java.util.ArrayList;

public class Aluno {

	// atributos
	private String nome;
	private int advertencias;
	private int idade;
	private ArrayList<Turma> listaDeTurmas;

	// construtores sem parâmetros
	public Aluno() {
		this.nome = "";
		this.advertencias = 0;
		this.idade = 0;
		this.listaDeTurmas = new ArrayList<>();
	}

	// construtores com parâmetros
	public Aluno(String nome, int advertencias, int idade, ArrayList<Turma> listaDeTurmas) {
		this.nome = nome;
		this.advertencias = advertencias;
		this.idade = idade;
		this.listaDeTurmas = new ArrayList<>();
	}

	// métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAdvertencias() {
		return advertencias;
	}

	public void setAdvertencias(int advertencias) {
		this.advertencias = advertencias;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public ArrayList<Turma> getListaDeTurmas() {
		return listaDeTurmas;
	}

	public void setListaDeTurmas(ArrayList<Turma> listaDeTurmas) {
		this.listaDeTurmas = listaDeTurmas;
	}

	public void adicionarTurma(Turma turma) {
		listaDeTurmas.add(turma);
	}
	public void listarTurmas() {
	    System.out.println("Turmas de " + nome + ":");
	    if (listaDeTurmas.isEmpty()) {
	        System.out.println("Este aluno não está matriculado em nenhuma turma.");
	    } else {
	        for (Turma turma : listaDeTurmas) {
	            System.out.println(turma.getNumero());
	        }
	    }
	}
}
