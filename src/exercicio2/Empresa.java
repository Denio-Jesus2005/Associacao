package exercicio2;

import java.util.ArrayList;

public class Empresa {

	//atributos
	private String nome;
	private int cnpj;
	private String nomeRua;
	private ArrayList<Funcionario> listaFuncionarios;
	
	//construtores sem parâmetro
	public Empresa() {
		this.nome = "";
		this.cnpj = 0;
		this.nomeRua = "";
		this.listaFuncionarios = new ArrayList<Funcionario>();
	}
	
	//construtores com parametro
	public Empresa(String nome, int cnpj, String nomeRua, ArrayList<Funcionario> listaFuncionarios) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.nomeRua = nomeRua;
		this.listaFuncionarios = listaFuncionarios;
	}
	
	//métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
}
