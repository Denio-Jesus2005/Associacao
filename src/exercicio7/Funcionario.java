package exercicio7;

import java.util.ArrayList;

public class Funcionario {

	// atributos
	private String nome;
	private int idade;
	private double salario;
	private ArrayList<Departamento> listaDepartamentos;
	private ArrayList<Projeto> projetosAssociados;
	// construtores sem parâmetros
	public Funcionario() {
		this.nome = "";
		this.idade = 0;
		this.salario = 0.0;
		this.listaDepartamentos = new ArrayList<>();
		this.projetosAssociados = new ArrayList<>();
	}
	// construtores com parâmetros
	public Funcionario(String nome, int idade, double salario, ArrayList<Departamento> listaDepartamentos, ArrayList<Projeto> projetosAssociados) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.listaDepartamentos = listaDepartamentos;
		this.projetosAssociados = projetosAssociados;
	}
	// métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public ArrayList<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}
	public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}
	public ArrayList<Projeto> getProjetosAssociados() {
		return projetosAssociados;
	}
	public void setProjetosAssociados(ArrayList<Projeto> projetosAssociados) {
		this.projetosAssociados = projetosAssociados;
	}
	
}
