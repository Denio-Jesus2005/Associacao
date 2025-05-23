package exercicio6;

import java.util.ArrayList;

public class Produto {

	// atributos
	private String nome;
	private double preco;
	private int estoque;
	private ArrayList<ItemPedido> listaItemPedido;
	// construtores sem parâmetros
	public Produto() {
		this.nome = "";
		this.preco = 0.0;
		this.estoque = 0;
		this.listaItemPedido = new ArrayList<>();
}
	// construtores com parâmetros
	public Produto(String nome, double preco, int estoque, ArrayList<ItemPedido> listaItemPedido) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		this.listaItemPedido = listaItemPedido;
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
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public ArrayList<ItemPedido> getListaItemPedido() {
		return listaItemPedido;
	}
	public void setListaItemPedido(ArrayList<ItemPedido> listaItemPedido) {
		this.listaItemPedido = listaItemPedido;
	}
	
}
