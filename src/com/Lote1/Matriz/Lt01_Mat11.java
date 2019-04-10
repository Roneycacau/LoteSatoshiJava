package com.Lote1.Matriz;
/*
 * Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo:
 * [01] [01] [01] [01] [01] [01] [01] [01]
 * [01] [02] [02] [02] [02] [02] [02] [01]
 * [01] [02] [03] [03] [03] [03] [02] [01]
 * [01] [02] [03] [04] [04] [03] [02] [01]
 * [01] [02] [03] [04] [04] [03] [02] [01]
 * [01] [02] [03] [03] [03] [03] [02] [01]
 * [01] [02] [02] [02] [02] [02] [02] [01]
 * [01] [01] [01] [01] [01] [01] [01] [01] 
 *	
 *	author: Roney Cacau
 *	Data: 07/04/2019
 */
public class Lt01_Mat11 {
	public static void main(String args[]) {
		int[][] mat = new int[8][8];
		
		for(int z = 1; z<=4; z++) {
			for(int x = z-1;x<=(8-z);x++) {
				for(int y = z-1;y<=(8-z);y++) {
					mat[x][y] = z;
				}
			}
		}
		
		for(int[] vet: mat) {
			for(int bla : vet) {
				System.out.print(" " + bla + " ");
			}
			System.out.println();
		}
	}
}
