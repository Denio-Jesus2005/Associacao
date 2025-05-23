package exercicio10;

import java.util.ArrayList;

public class Disciplina {

	// atributos
	private String nome;
	private int sala;
	private String horario;
	private ArrayList<Curso> listaCursos;
	private ArrayList<Professor> listaProfessores;
	// construtores sem parâmetros
	public Disciplina() {
		this.nome = "";
		this.sala = 0;
		this.horario = "";
		this.listaCursos = new ArrayList<>();
		this.listaProfessores = new ArrayList<>();
	}
	// construtores com parâmetros
	public Disciplina(String nome, int sala, String horario, ArrayList<Curso> listaCursos) {
		this.nome = nome;
		this.sala = sala;
		this.horario = horario;
		this.listaCursos = listaCursos;
		this.listaProfessores = listaProfessores;
	}
	// métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public ArrayList<Curso> getListaCursos() {
		return listaCursos;
	}
	public void setListaCursos(ArrayList<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}
	public ArrayList<Professor> getListaProfessores() {
		return listaProfessores;
	}
	public void setListaProfessores(ArrayList<Professor> listaProfessores) {
		this.listaProfessores = listaProfessores;
	}
	public void imprimirDados() {
		System.out.println("Tipo da disciplina: ");
		System.out.println("Nomes dos professores: ");
	}
	
}
