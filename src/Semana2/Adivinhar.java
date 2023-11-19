package Semana2;

import java.util.Random;
import java.util.Scanner;

public class Adivinhar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(100) +1;
		int palpite = 0;
		
		while(palpite != numeroAleatorio) {
			System.out.println("Digite o seu palpite; ");
			palpite = sc.nextInt();
			
			if(palpite < numeroAleatorio) {
				System.out.println("Mais alto!");
			}else if(palpite > numeroAleatorio) {
				System.out.println("Mais baixo!");
			}
		}
		
		System.out.println("Parabéns! Você acertou. Seu número foi: " + palpite);
		
	}
}
