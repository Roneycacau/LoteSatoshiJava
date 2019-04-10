package com.Lote1.Matriz;
import java.util.Random;

/*
 * Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo:
 * [01][  ][  ][  ]
 * [  ][04][  ][  ]
 * [  ][  ][16][  ]
 * [  ][  ][  ][64]
 *	
 *	author: Roney Cacau
 *	Data: 07/04/2019
 */

	
public class Lt01_Mat09 {
	public static void main(String args[]) {
		int[][] matriz = new int[4][4];
		Random aleatorio = new Random();
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz.length;j++) {
				if(i==j) {
					matriz[i][j] = (int)Math.pow(4, i);
				}else {
					matriz[i][j] = aleatorio.nextInt(99);
				}
			}
		}
		
		for(int[] vet : matriz) {
			for(int bla: vet) {
				System.out.print("[" + String.format("%02d", bla) + "]");
			}
			System.out.println();
		}
		
	}
}
