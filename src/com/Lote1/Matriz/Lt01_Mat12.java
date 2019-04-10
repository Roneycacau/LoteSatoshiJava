package com.Lote1.Matriz;
/*
 * Carregar códigos das peças em um tabuleiro de xadrez, onde: 
 *  [01]  [02]   [03]   [04]     [05]   [06] [07]
 * [peao][torre][bispo][cavalo][rainha][rei][vazio]
 * Calcular e mostrar a soma das peças do tabuleiro.
 * Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peças

 *	author: Roney Cacau
 *	Data: 07/04/2019
 */

import java.util.Random;

import javax.swing.JOptionPane;

public class Lt01_Mat12 {
	public static void main(String args[]) {
		int[][] tabuleiro = new int[8][8];
		int[] pontos = new int[8];
		Random aleatorio = new Random();
		String menssagem = "";
		
		for(int i = 0;i<tabuleiro.length;i++) {
			for(int j = 0;j<tabuleiro.length;j++) {
				tabuleiro[i][j] = aleatorio.nextInt(7)+1;
			}
		}
		for(int[] vet : tabuleiro) {
			for(int montar : vet) {
				System.out.print(" " + montar + " ");
			}
			System.out.println();
		}
		
		for(int i = 0;i<tabuleiro.length;i++) {
			for(int j = 0;j<tabuleiro.length;j++) {
				pontos[tabuleiro[i][j]]++;
			}
		}
		for(int i = 0;i<pontos.length;i++) {
			menssagem += " " + pontos[i];
			pontos[0] += pontos[i];
		}
		
		JOptionPane.showMessageDialog(null, "A soma dos pontos das peças é " + pontos[0], menssagem, JOptionPane.INFORMATION_MESSAGE);
	}
}
