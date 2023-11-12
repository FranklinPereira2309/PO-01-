package projeto1;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double numero1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numero2 = scanner.nextDouble();
		
		System.out.println("Escolha um operação");
		System.out.println("1- Adição");
		System.out.println("2- Subtração");
		System.out.println("3- Divisão");
		System.out.println("4- Multiplicação");
		
		
		int operacao = scanner.nextInt();
		double resultado = 0;
		
		
		switch (operacao) {
			case 1: 
				resultado = numero1 + numero2;
				break;
			case 2:
				resultado = numero1 - numero2;
				break;
			case 3:
				resultado = numero1 / numero2;
				break;
			case 4: 
				resultado = numero1 * numero2;
				break;
			case 0:
				System.out.println("Obrigado até logo!!");
			default:
				System.out.println("Opção inválida");
				break;
				
		}
	
		System.out.println("O resultado é: " + resultado);

		scanner.close();
	
	}
}
