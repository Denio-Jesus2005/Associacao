package exercicio4;

import java.util.ArrayList;

public class Curso {

	// atributos
	private String nomeCurso;
	private int quantidadeAlunos;
	private String local;
	private ArrayList<Disciplina> listaDisciplinas;
	
	// construtores sem parâmetros
	public Curso() {
		this.nomeCurso = "";
		this.quantidadeAlunos = 0;
		this.local = "";
		this.listaDisciplinas = new ArrayList<>();
	}
	// construtores com parâmetros
	public Curso(String nomeCurso, int quantidadeAlunos, String local, ArrayList<Disciplina> listaDisciplinas) {
		this.nomeCurso = nomeCurso;
		this.quantidadeAlunos = quantidadeAlunos;
		this.local = local;
		this.listaDisciplinas = listaDisciplinas;
	}
	// métodos
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}
	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public ArrayList<Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}
	public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}
	
}
