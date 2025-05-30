package exercicio5;

import java.util.ArrayList;

public class Loja {

	// atributos
	private String nome;
	private String local;
	private double aluguel;
	private ArrayList<Produto> listaDeProdutos;

	// construtores sem parâmetros
	public Loja() {
		this.nome = "";
		this.local = "";
		this.aluguel = 0.0;
		this.listaDeProdutos = new ArrayList<>();
	}

	// construtores com parâmetros
	public Loja(String nome, String local, double aluguel) {
		this.nome = nome;
		this.local = local;
		this.aluguel = aluguel;
		this.listaDeProdutos = new ArrayList<>();
	}

	// métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	public ArrayList<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}

	public void adicionarProduto(Produto produto) {
		listaDeProdutos.add(produto);
		produto.adicionarLoja(this);
	}

	public void acessarLoja(Produto produto) {
		for (Produto produto1 : listaDeProdutos) {
			System.out.println("O produto " + produto1.getNome() + "pode ser encontrado na loja " + nome);
		}
	}
}
