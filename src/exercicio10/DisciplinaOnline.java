package exercicio10;

import java.util.ArrayList;

public class DisciplinaOnline extends Disciplina{

	// atributos
	private String linkDeAcesso;
	// construtores sem parâmetros
	public DisciplinaOnline() {
		super();
		this.linkDeAcesso = "https://acessa_ai.com.br";
	}
	// construtores com parâmetros
	public DisciplinaOnline(String nome, int sala, String horario, ArrayList<Curso> listaCursos, String linkDeAcesso) {
		super(nome, sala, horario, listaCursos);
		this.linkDeAcesso = linkDeAcesso;
	}
	// métodos
	public String getLinkDeAcesso() {
		return linkDeAcesso;
	}
	public void setLinkDeAcesso(String linkDeAcesso) {
		this.linkDeAcesso = linkDeAcesso;
	}
	@Override
	public void imprimirDados() {
		System.out.println("Tipo: Online" );
		System.out.println("Nomes dos Professores: ");
	}
}
