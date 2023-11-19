package Semana2;

import java.util.Scanner;

public class Moeda {
	 public static double converter(double taxaDeCambio, double quantidadeReais) {
	        return quantidadeReais * taxaDeCambio;
	    }
	 
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);

	        System.out.println("Digite a taxa de câmbio: ");
	        double taxaDeCambio = sc.nextDouble();

	        System.out.println("Digite a quantidade em Reais: ");
	        double quantidadeReais = sc.nextDouble();

	        double valorConvertido = Moeda.converter(taxaDeCambio, quantidadeReais);

	        System.out.println("O valor convertido em Reais convertido eh R$: " + valorConvertido);

	        sc.close();
	}
}
