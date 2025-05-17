package exercicio2;

import java.util.ArrayList;

public class Funcionario {

	// atributos
	private String nome;
	private int idade;
	private double salario;
	private ArrayList<Empresa> listaEmpresas;

	// construtores com parâmetro
	public Funcionario() {
		this.nome = "";
		this.idade = 0;
		this.salario = 0.0;
		this.listaEmpresas = new ArrayList<>();
	}

	// construtores sem parametro
	public Funcionario(String nome, int idade, double salario, ArrayList<Empresa> listaEmpresas) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.listaEmpresas = listaEmpresas;
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

	public ArrayList<Empresa> getEmpresa() {
		return listaEmpresas;
	}

	public void setEmpresa(ArrayList<Empresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}

}
