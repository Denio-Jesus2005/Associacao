package exercicio7;

public class Main {

	public static void main(String[] args) {

		Projeto p1 = new Projeto("Projeto  final de ano", 45, "Outubro");
		Projeto p2 = new Projeto("Projeto inicio de ano", 44, "Dezembro");
		
		Funcionario joao = new Funcionario("João", 21, 5000);
		Funcionario pedro = new Funcionario("Pedro", 25, 4000);
		
		Departamento d1 = new Departamento("Departamento de artes", 3712, "Porto Algere");

		p1.addFuncionarioAssociado(pedro);
		p2.addFuncionarioAssociado(joao);
		
		joao.addDepartamento(d1);
		joao.addProjetoAssociado(p2);
		
		pedro.addDepartamento(d1);
		pedro.addProjetoAssociado(p2);
	}

}
