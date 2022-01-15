package alura;

public class TesteCondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testando Condicionais \n ");
		
		//int idade = 19;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
		 acompanhado = true;
		} else {
		 acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);
	}

}
