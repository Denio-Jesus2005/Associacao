package exercicio10;

import java.util.ArrayList;

public class DisciplinaPresencial {

	// atributos
	private String numeroSala;
	// construtores sem parâmetros
	public DisciplinaPresencial() {
		super();
		this.numeroSala = "";
	}
	// construtores com parâmetros
	public DisciplinaPresencial(String nome, int sala, String horario, ArrayList<Curso> listaCursos, String numeroSala) {
		super();
		this.numeroSala = numeroSala;
	}
	// métodos
	public String getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(String numeroSala) {
		this.numeroSala = numeroSala;
	}
	@Override
	public void imprimirDados() {
		System.out.println("Tipo: Presencial");
		System.out.println("Nomes dos professores: ");
	}
}
