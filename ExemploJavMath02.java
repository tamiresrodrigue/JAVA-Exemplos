package exemplos;

import java.util.Scanner;


public class ExemploJavMath02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int numero01 = sc.nextInt();
		System.out.println("O valor da raiz quadrada é: " + Math.sqrt(numero01));
		sc.close();
	}

}
