package aula08;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		/*
		 * adição = +
		 * subtracao = -
		 * multiplicação = *
		 * Divisao = /
		 * Modulo = % (resto da divisao)
		 * 
		 */

		int soma = 2 + 10;
		int subtracao = 15 - 5;
		int multiplicacao = 2 * 8;
		int divisao = 25/5;
		int modulo = 5%2;
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		System.out.println(modulo);
		
		int n1 = 99;
		int n2 = 80;
		int n3 = 53;
		
		int totalGeral = (n1 + n2 + n3);
		System.out.println(totalGeral);
		
		int media = (totalGeral/3);
		
		System.out.println(media);
		
	}

}
