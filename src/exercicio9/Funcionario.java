package exercicio9;

public class Funcionario {

	// atributos
	private String nome;
	private int idade;
	private double salario;
	private String responsavelDeProjeto;
	private String realizaTarefa;
	private Projeto projeto;
	private Tarefa tarefa;
	// construtores sem parâmetros
	public Funcionario() {
		this.nome = "";
		this.idade = 0;
		this.salario = 0.0;
		this.responsavelDeProjeto = "";
		this.realizaTarefa = "";
		this.projeto = new Projeto();
		this.tarefa = new Tarefa();
	}
	// construtores com parâmetros
	public Funcionario(String nome, int idade, double salario, String responsavelDeProjeto, String realizarTarefa, Projeto projeto, Tarefa tarefa) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.responsavelDeProjeto = responsavelDeProjeto;
		this.realizaTarefa = realizaTarefa;
		this.projeto = projeto;
		this.tarefa = tarefa;
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
	public String getResponsavelDeProjeto() {
		return responsavelDeProjeto;
	}
	public void setResponsavelDeProjeto(String responsavelDeProjeto) {
		this.responsavelDeProjeto = responsavelDeProjeto;
	}
	public String getRealizaTarefa() {
		return realizaTarefa;
	}
	public void setRealizaTarefa(String realizaTarefa) {
		this.realizaTarefa = realizaTarefa;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public Tarefa getTarefa() {
		return tarefa;
	}
	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
}
