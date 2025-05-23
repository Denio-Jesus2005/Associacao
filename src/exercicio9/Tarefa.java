package exercicio9;

import java.util.ArrayList;

public class Tarefa {

	// atributos
	private String nome;
	private String dificuldade;
	private String descricao;
	private Funcionario funcionario;
	private ArrayList<Projeto> listaProjetos;

	// construtores sem parâmetros
	public Tarefa() {
		this.nome = "";
		this.dificuldade = "";
		this.descricao = "";
		this.funcionario = new Funcionario();
		this.listaProjetos = new ArrayList<>();
	}

	// construtores com parâmetros
	public Tarefa(String nome, String dificuldade, String descricao, Funcionario funcionario,
			ArrayList<Projeto> listaProjetos) {
		this.nome = nome;
		this.dificuldade = dificuldade;
		this.descricao = descricao;
		this.funcionario = funcionario;
		this.listaProjetos = listaProjetos;
	}
	// métodos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public ArrayList<Projeto> getListaProjetos() {
		return listaProjetos;
	}

	public void setListaProjetos(ArrayList<Projeto> listaProjetos) {
		this.listaProjetos = listaProjetos;
	}
	
}
