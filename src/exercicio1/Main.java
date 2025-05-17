package exercicio1;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Joaozinho", 10, "joao.com", null);
		Endereco endereco = new Endereco("Rua do João", "Bairro do João", 148, aluno);
		
		System.out.println("Dados do aluno");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("idade: " + aluno.getIdade());
        System.out.println("Email: " + aluno.getEmail());
        System.out.println();
        System.out.println("Endereço do " + endereco.getAluno().getNome() + ": ");
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Número da residência: " + endereco.getNumero());
	}

}
