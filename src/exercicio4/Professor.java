package exercicio4;

public class Professor {

	// atributos
	private String nome;
	private int idade;
	private double salario;
	private Disciplina disciplina;
	// construtores sem parâmetros
	public Professor() {
		this.nome = "";
		this.idade = 0;
		this.salario = 0.0; 
		this.disciplina = new Disciplina();
	}
	// construtores com parâmetros
	public Professor(String nome, int idade, double salario, Disciplina disciplina) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.disciplina = disciplina;
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
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
}
