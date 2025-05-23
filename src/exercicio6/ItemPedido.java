package exercicio6;

import java.util.ArrayList;

public class ItemPedido {

	// atributos
	private String nome;
	private double preco;
	private int estoque;
	private ArrayList<Pedido> listaPedidos;
	private ArrayList<Produto> listaProdutos;
	// construtores sem parâmetros
	public ItemPedido() {
		this.nome = "";
		this.preco = 0.0;
		this.estoque = 0;
		this.listaPedidos = new ArrayList<>();
		this.listaProdutos = new ArrayList<>();
	}
	// construtores com parâmetros
	public ItemPedido(String nome, double preco, int estoque, ArrayList<Pedido>listaPedidos, ArrayList<Produto> listaProdutos) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		this.listaPedidos = listaPedidos;
		this.listaProdutos = listaProdutos;
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
	public ArrayList<Pedido> getListaPedidos() {
		return listaPedidos;
	}
	public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
}
