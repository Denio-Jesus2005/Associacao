package exercicio5;

public class Main {

	public static void main(String[] args) {

		//criar loja
		Loja musitech = new Loja("Musitech Store", "São Leopoldo", 1200.50);

		//criar 2 produtos
		Produto guitarra = new Produto("Guitarra Vermelha", 5000.95, 100.50);
		Produto baixo = new Produto("Baixo verde", 8000.00, 900.00);
		
		//adicionar o produto na loja
		musitech.adicionarProduto(guitarra);
		musitech.adicionarProduto(baixo);
		
		//acessar a loja pelo produto
		guitarra.acessarLoja(baixo);
		
	}

}
