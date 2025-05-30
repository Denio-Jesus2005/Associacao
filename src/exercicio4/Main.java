package exercicio4;

public class Main {

	public static void main(String[] args) {

		// instanciar um curso
		Curso ads = new Curso("Análise e Desenvolvimento de Sistemas", 30, "Sapucaia do Sul");

		// criar 2 disciplinas
		Disciplina poo = new Disciplina("Programação orientada a Objetos", 80.00, 10);
		Disciplina matematica = new Disciplina("Matemática Vetorial", 80.00, 10);

		// adicionar 2 disciplinas a ele
		ads.adicionarDisciplina(poo);
		ads.adicionarDisciplina(matematica);

		// Instanciar um professor
		Professor rodrigo = new Professor("Rodrigo Remor", 40, 10000.00, null);
		Professor sandro = new Professor("Sandrinho", 50, 10000.00, null);

		// Atribui um professor a cada disciplina
		poo.setProfessor(rodrigo);
		matematica.setProfessor(sandro);
		
		//Lista as disciplinas do curso e seus respectivos professores
		ads.listarDisciplinas();
		
		System.out.println("---------------------------");
		
		//imprimir os dados
		ads.imprimirDados();
	}

}
