package exercicio2;

public class Main {
	
	public static void main(String[] args) {
		
		//criar a empresa
		Empresa empresa = new Empresa("Lydians Sistema de Informação", 123456789, "Avenida Unisinos", null);
		
		//criar 3 funcionarios
		Funcionario func1 = new Funcionario("Denis", 19, 500, null);
		Funcionario func2 = new Funcionario("Joao", 18, 400, null);
		Funcionario func3 = new Funcionario("Maria", 20, 1500, null);
		
		//adicionar 3 funcionarios a ela
		empresa.acrescentarFuncionario(func1);
		empresa.acrescentarFuncionario(func2);
		empresa.acrescentarFuncionario(func3);
		
		//lista os funcionarios
		empresa.listarFuncionarios();
		
		//acessa a empresa pelo funcionario
		empresa.acessarEmpresa(func1);
		
		//imprimir os dados com adicionais
		empresa.imprimirDados(empresa);
	}

	public void acessarEmpresa(Funcionario funcionario, Empresa empresa) {
		System.out.println(funcionario.getNome() + "é da empresa" + empresa.getNome());
	}
}
