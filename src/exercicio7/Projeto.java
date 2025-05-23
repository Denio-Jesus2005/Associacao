package exercicio7;

import java.util.ArrayList;

public class Projeto {

	// atributos
	private String nome;
	private int codigo;
	private String mesInicio;
	private ArrayList<Funcionario> listaAssociadosAoProjeto;
	// construtores sem parâmetros
	public Projeto() {
		this.nome = "";
		this.codigo = 0;
		this.mesInicio = "";
		this.listaAssociadosAoProjeto = new ArrayList<>();
	}
	// construtores com parâmetros
	public Projeto(String nome, int codigo, String mesInicio, ArrayList<Funcionario> listaAssociadosAoProjeto) {
		this.nome = nome;
		this.codigo = codigo;
		this.mesInicio = mesInicio;
		this.listaAssociadosAoProjeto = listaAssociadosAoProjeto;
	}
	// métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMesInicio() {
		return mesInicio;
	}
	public void setMesInicio(String mesInicio) {
		this.mesInicio = mesInicio;
	}
	public ArrayList<Funcionario> getListaAssociadosAoProjeto() {
		return listaAssociadosAoProjeto;
	}
	public void setListaAssociadosAoProjeto(ArrayList<Funcionario> listaAssociadosAoProjeto) {
		this.listaAssociadosAoProjeto = listaAssociadosAoProjeto;
	}
	
}
