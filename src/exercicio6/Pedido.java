package exercicio6;

import java.util.ArrayList;

public class Pedido {

	// atributos
	private int codigoPedido;
	private String localEntrega;
	private String data;
	private ArrayList<ItemPedido> listaItemPedido;

	// construtores sem parâmetros
	public Pedido() {
		this.codigoPedido = 0;
		this.localEntrega = "";
		this.data = "";
	}

	// construtores com parâmetros
	public Pedido(int codigoPedido, String localEntrega, String data) {
		this.codigoPedido = codigoPedido;
		this.localEntrega = localEntrega;
		this.data = data;
		this.listaItemPedido = listaItemPedido;
	}
	// métodos

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getLocalEntrega() {
		return localEntrega;
	}

	public void setLocalEntrega(String localEntrega) {
		this.localEntrega = localEntrega;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<ItemPedido> getListaItemPedido() {
		return listaItemPedido;
	}

	public void setListaItemPedido(ArrayList<ItemPedido> listaItemPedido) {
		this.listaItemPedido = listaItemPedido;
	}
	
}