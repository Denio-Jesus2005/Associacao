package exercicio8;

import java.util.ArrayList;

public class OrdemDeServico {

	// atributos
	private int codigo;
	private String cliente;
	private double preco;
	private ArrayList<Servico> listaServicos;
	// construtores sem parâmetros
	public OrdemDeServico() {
		this.codigo = 0;
		this.cliente = "";
		this.preco = 0.0;
		this.listaServicos = new ArrayList<>();
	}
	// construtores com parâmetros
	public OrdemDeServico(int codigo, String cliente, double preco, ArrayList<Servico> listaServicos) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.preco = preco;
		this.listaServicos = listaServicos;
	}
	// métodos
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public ArrayList<Servico> getListaServicos() {
		return listaServicos;
	}
	public void setListaServicos(ArrayList<Servico> listaServicos) {
		this.listaServicos = listaServicos;
	}
	
}
