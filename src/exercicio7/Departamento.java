package exercicio7;

import java.util.ArrayList;

public class Departamento {

	// atributos
	private String nome;
	private int codigo;
	private String local;
	private ArrayList<Funcionario> listaFuncionarios;
	// construtores sem parâmetros
	public Departamento() {
		this.nome = "";
		this.codigo = 0;
		this.local = "";
		this.listaFuncionarios = new ArrayList<>();
	}
	// construtores com parâmetros
	public Departamento(String nome, int codigo, String local) {
		this.nome = nome;
		this.codigo = codigo;
		this.local = local;
		this.listaFuncionarios = listaFuncionarios;
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
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}
	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	public void adicionarFuncionario(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
	}
	public void listarFuncionarios() {
		System.out.println("Funcionarios do" + nome);
		for(Funcionario funcionario : listaFuncionarios) {
			if() {
			System.out.println(funcionario.getNome());
			}
		}
	}
}
