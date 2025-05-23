package exercicio8;

import java.util.ArrayList;

public class Servico {

	// atributos
	private String nome;
	private String tipo;
	private double preco;
	private ArrayList<OrdemDeServico> listaOS;
	private Status status;
	// construtores sem parâmetros
	public Servico() {
		this.nome = "";
		this.tipo = "";
		this.preco = 0.0;
		this.listaOS = new ArrayList<>();
		this.status = new Status();
	}
	// construtores com parâmetros
	public Servico(String nome, String tipo, double preco, ArrayList<OrdemDeServico> listaOS, Status status) {
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.listaOS = listaOS;
		this.status = status;
	}
	// métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public ArrayList<OrdemDeServico> getListaOS() {
		return listaOS;
	}
	public void setListaOS(ArrayList<OrdemDeServico> listaOS) {
		this.listaOS = listaOS;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
}
