package exercicio4;

import java.util.ArrayList;

public class Disciplina {

	// atributos
	private String nomeDisciplina;
	private double horasTotais;
	private int avaliacao;
	private ArrayList<Curso> listaCursos;
	private Professor professor;

	// construtores sem parâmetros
	public Disciplina() {
		this.nomeDisciplina = "";
		this.horasTotais = 0.0;
		this.avaliacao = 0;
		this.listaCursos = new ArrayList<>();
		this.professor = new Professor();
	}

	// construtores com parâmetros
	public Disciplina(String nomeDisciplina, double horasTotais, int avaliacao) {
		this.nomeDisciplina = nomeDisciplina;
		this.horasTotais = horasTotais;
		this.avaliacao = avaliacao;
		this.listaCursos = new ArrayList<>();
		this.professor = new Professor();
	}
	// métodos

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public double getHorasTotais() {
		return horasTotais;
	}

	public void setHorasTotais(double horasTotais) {
		this.horasTotais = horasTotais;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public ArrayList<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(ArrayList<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
