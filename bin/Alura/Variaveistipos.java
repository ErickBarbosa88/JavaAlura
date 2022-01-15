package alura;


public class Variaveistipos {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais \n ");
		int idade = 20;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("seja bem vindo");
		}else {
			if(quantidadePessoas >= 2) {
				System.out.println("voce nao tem 18,"
						+ " mas pode entrar pois esta acompanhado ");
			}
			System.out.println("Infelizmente voce nao pode entrar");
		}
	}

}
