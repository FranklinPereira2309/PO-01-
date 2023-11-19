package Semana2;

import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
	private int[] arr;
		
	void criarArray(int tamanho, Scanner sc) {
		arr = new int[tamanho];
		for(int i = 0; i < tamanho; i++) {
			System.out.println("Digite o elemento do indice "+ i + " : ");
			arr[i] = sc.nextInt(); 
		}
		System.out.println("Array concluido!");
		
	}
	void exibirArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	
	void gerarArrayAleatorio(int tamanho, Random random) {
		arr = new int[tamanho] ; 
		for(int i = 0; i < tamanho; i++) {
			arr[i] = random.nextInt(100) +1;
		}
		
		
	}
	
	public static int maiorValor(int[] array) {
        int maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        return maior;
    }
	
	public static int menorValor(int[] array) {
        int menor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > menor) {
                menor = array[i];
            }
        }

        return menor;
    }
	
	public static int somaArray(int[] array) {
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        return soma;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		ManipulaArray ma = new ManipulaArray();
		int opcao = 0;
		
		do{
			System.out.println("Escolha uma opção");
			System.out.println("1- Criar Array com input" );
			System.out.println("2- Criar Array aleatório");
			System.out.println("3- Exbir o Array");
			System.out.println("4- Calcular a soma de todos os elementos do Array");
			System.out.println("5- Encontrar o MAIOR VALOR do Array");
			System.out.println("6- Encontrar o MENOR VALOR do Array");
			System.out.println("10- Sair");
			System.out.print("Digite sua opção: ");
			opcao = sc.nextInt();
			
			int tamanho = 0;
			switch(opcao) {
			
			case 1:
				System.out.println("Digite o tamanho do array: ");
				tamanho = sc.nextInt();
				ma.criarArray(tamanho, sc);
				break;
			case 2:
				System.out.println("Digite o tamnho do array: ");
				tamanho = sc.nextInt();
				ma.gerarArrayAleatorio(tamanho, random);  
				break;
			case 3:
				ma.exibirArray(ma.arr);
				break;
			case 0:
				break;
			default:
				System.out.println("Opção invárlida!");
			}
		}while(opcao != 10);
		
		sc.close();
	}

}
