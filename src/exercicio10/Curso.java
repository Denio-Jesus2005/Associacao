package exercicio10;

import java.util.ArrayList;

public class Curso {

	// atributos
	private String nome;
	private double duracao;
	private double avaliacao;
	private ArrayList<Disciplina> listaDisciplinas;
	// construtores sem parâmetros
	public Curso() {
		this.nome = "";
		this.duracao = 0.0;
		this.avaliacao = 0.0;
		this.listaDisciplinas = new ArrayList<>();
	}
	// construtores com parâmetros
	public Curso(String nome, double duracao, double avaliacao, ArrayList<Disciplina> listaDisciplinas) {
		this.nome = nome;
		this.duracao = duracao;
		this.avaliacao = avaliacao;
		this.listaDisciplinas = listaDisciplinas;
	}
	// métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public double getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	public ArrayList<Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}
	public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}
	
}
