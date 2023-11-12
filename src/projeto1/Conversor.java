package projeto1;

import java.util.Scanner;


public class Conversor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura desejada: ");
		double temperatura = scanner.nextDouble();
		
		System.out.println("Selecione o Tipo de conversão: ");
		System.out.println("1- Celsius para Fahrenheit");
		System.out.println("2- Fahrenheit para Celsius");
		
		int opcao = scanner.nextInt();
		double resultado = 0;
		if(opcao == 1) 
		{
			resultado = (temperatura * 9/5) + 32;
			System.out.println("A temperatura em Fahrenheit é: " +resultado);
		}
		else if(opcao == 2)
		{
			resultado = (temperatura - 32) * 5/9;
			System.out.println("A temperatura em Celsius é: " + Math.round(resultado));
		}
		else 
		{
			System.out.println("Opção digitada inválida!");
		}
	
	}
}
