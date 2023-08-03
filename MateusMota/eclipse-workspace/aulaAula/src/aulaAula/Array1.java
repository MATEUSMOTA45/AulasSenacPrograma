package aulaAula;

import java.security.spec.DSAPrivateKeySpec;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 
		Scanner scanner = new Scanner(System.in);
		
		//solicita ao  usuário as dimensões da matrix                                                      
		
		 System.out.println("Digete o números de linhas da matriz : ");
		 int linhas = scanner.nextInt();
		 System.out.println("Digete o números de colunas da matriz: ");
		 int colunas = scanner.nextInt();
		 
		 //Cria a matriz com as dimensoes informadas 
		 int [][] matriz = new int [linhas] [colunas];
		 
		 //solicita ao usuário os valores da matriz
		 System.out.println("Digete os  valores da matriz: ");
		 for(int i = 0; i < linhas; i++) {
			 for (int j = 0; j < colunas; j++) {
				 System.out.println("Valor da posição [" + i + "][" + j + "]:"); 
				 matriz [i] [j] = scanner.nextInt();
			}
		 }
		 
		 //chama o método para somar os elemnentos da matriz 
		 int soma = somarElementosMatriz(matriz);
		 
		 //exibe o resultado
		 System.out.println("A soma de todos os elementos da matriz é: "+ soma);
		

}

	private static int somarElementosMatriz(int[][] matriz) {
		// TODO Auto-generated method stub
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				soma += matriz[i][j];
			}
			
		}
		return soma;
		
	}

}




