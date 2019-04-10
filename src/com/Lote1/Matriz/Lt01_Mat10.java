package com.Lote1.Matriz;

/*
 * Criar uma matriz [8][8] onde o programa irá carregar segundo:
 * [01][02][03][04][..]
 * [01][02][04][08][..]
 * 
 *	
 *	author: Roney Cacau
 *	Data: 07/04/2019
 */


public class Lt01_Mat10 {
	public static void main(String args[]) {
		int[][] matriz = new int[8][8];
		
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz.length;j++) {
				if(i==0) {
					matriz[i][j] = (int)Math.pow(j+1, i+1);
				}else {
					matriz[i][j] = (int)Math.pow(i+1, j);
				}
			}
		}
		
		for(int[] vet : matriz) {
			for(int i : vet) {
				System.out.print(" " + String.format("%7d", i) + " ");
			}
			System.out.println();
		}
	}
}
