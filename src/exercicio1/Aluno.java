package exercicio1;

public class Aluno {

	// atributos
	private String nome;
	private int idade;
	private String email;
	private Endereco endereco;

	// construtores
	// sem parâmetros
	public Aluno() {
		this.nome = "";
		this.idade = 0;
		this.email = "";
		this.endereco = new Endereco();
	}

	// com parâmetros
	public Aluno(String nome, int idade, String email, Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.endereco = endereco;
	}

	// métodos
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getEmail() {
		return email;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
