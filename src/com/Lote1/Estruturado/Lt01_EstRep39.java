package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
			Casa: 	1	2	3	4	...	64
			Qdte:	1	2	4	8	...	N

 * Programador: Roney Cacau
 * Data Criação: 25/02/2019
 *********************************************
 */
public class Lt01_EstRep39 {

	public static void main(String[] args) {
		for(int i = 0;i<=63;i++) {
			System.out.print((i+1) + "     ");		
			System.out.println((int)(Math.pow(2, i)) + " ");		
		}
	}
}