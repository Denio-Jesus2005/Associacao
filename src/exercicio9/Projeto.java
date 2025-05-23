package exercicio9;

import java.util.ArrayList;

public class Projeto {

	// atributos
	private String nome;
	private double preco;
	private String dataInicio;
	private Funcionario funcionario;
	private ArrayList<Tarefa> listaTarefas;
	// construtores sem parâmetros
	public Projeto() {
		this.nome = "";
		this.preco = 0.0;
		this.dataInicio = "";
		this.funcionario = new Funcionario();
		this.listaTarefas = new ArrayList<>();
	}
	// construtores com parâmetros
	public Projeto(String nome, double preco, String dataInicio, Funcionario funcionario, ArrayList<Tarefa> listaTarefas) {
		this.nome = nome;
		this.preco = preco;
		this.dataInicio = dataInicio;
		this.funcionario = funcionario;
		this.listaTarefas = listaTarefas;
	}
	// métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public ArrayList<Tarefa> getListaTarefas() {
		return listaTarefas;
	}
	public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}
	
}
