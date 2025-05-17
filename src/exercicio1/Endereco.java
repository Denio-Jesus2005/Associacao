package exercicio1;

public class Endereco {

	// atributos
	private String rua;
	private String bairro;
	private int numero;
	private Aluno aluno;

	// construtores
	// sem parametros
	public Endereco() {
		this.rua = "";
		this.bairro = "";
		this.numero = 0;
		this.aluno = new Aluno();
	}

	// com parametros
	public Endereco(String rua, String bairro, int numero, Aluno aluno) {
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.aluno = aluno;
	}

	// métodos
	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public int getNumero() {
		return numero;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
