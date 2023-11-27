package Semana3;

import java.util.Scanner;

class DivisionByZeroExeption extends Exception {
	public DivisionByZeroExeption(String message) {
		super(message);
	}
}

public class Calculadora {
	public int somar(int a, int b) {
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	public double dividir(double a, double b) throws DivisionByZeroExeption {
		try {
			if(b == 0.0) {
				throw new DivisionByZeroExeption("Divisão por zero não permitida.");
				
			}
			return a / b;
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return 0;
	}
	
	public static void main(String[] args) throws DivisionByZeroExeption {
		Calculadora calculadora = new Calculadora();
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		
			do 
			{
				System.out.println("*****> MENU <*****");
				System.out.println("1 - Somar");
				System.out.println("2 - Subtrair");
				System.out.println("3 - Multiplicar");
				System.out.println("4 - Dividir");
				System.out.println("5 - Sair");
				System.out.print("Digite sua opção: ");
				opcao = sc.nextInt();
				
				switch (opcao) {
				case 1: 
				{
					System.out.print("Digite o primeiro número: ");
					int a = sc.nextInt();
					System.out.print("Digite o segundo número: ");
					int b = sc.nextInt();
					int soma = calculadora.somar(a, b);
					System.out.println("A soma foi: " + soma);
					System.out.println(" ");
					break;
				}
				case 2:
				{
					System.out.print("Digite o primeiro número: ");
					int a = sc.nextInt();
					System.out.print("Digite o segundo número: ");
					int b = sc.nextInt();
					int subtrair = calculadora.subtrair(a, b);
					System.out.println("A soma foi: " + subtrair);
					System.out.println(" ");
					break;
				}
				case 3:
				{
					System.out.print("Digite o primeiro número: ");
					int a = sc.nextInt();
					System.out.print("Digite o segundo número: ");
					int b = sc.nextInt();
					int multiplicar = calculadora.multiplicar(a, b);
					System.out.println("A soma foi: " + multiplicar);
					System.out.println(" ");
					break;
				}
				case 4:
				{
					System.out.print("Digite o primeiro número: ");
					double a = sc.nextInt();
					System.out.print("Digite o segundo número: ");
					double b = sc.nextInt();
					double dividir = calculadora.dividir(a, b);
						if(dividir == 0) {
							System.out.println(" ");
							break;
							
						}
					System.out.println("A divisão foi: " + dividir);
					break;
				}
				case 5:
				{
					System.out.println("Progama Finalizado Com Sucesso!!");
					System.out.println(" ");
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcao);
				}
				}while(opcao != 5);
			
			sc.close();
			
		
	}
}
