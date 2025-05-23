package exercicio5;

import java.util.ArrayList;

public class Produto {

	// atributos
	private String nome;
	private double preco;
	private double precoMercado;
	private ArrayList<Loja> listaLojas;
	// construtores sem parâmetros
	public Produto() {
		this.nome = "";
		this.preco = 0.0;
		this.precoMercado = 0.0;
		this.listaLojas = new ArrayList<>();
	}
	// construtores com parâmetros
	public Produto(String nome, double preco, double precoMercado, ArrayList<Loja> listaLojas) {
		this.nome = nome;
		this.preco = preco;
		this.precoMercado = precoMercado;
		this.listaLojas = listaLojas;
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
	public double getPrecoMercado() {
		return precoMercado;
	}
	public void setPrecoMercado(double precoMercado) {
		this.precoMercado = precoMercado;
	}
	public ArrayList<Loja> getListaLojas() {
		return listaLojas;
	}
	public void setListaLojas(ArrayList<Loja> listaLojas) {
		this.listaLojas = listaLojas;
	}
	
}
