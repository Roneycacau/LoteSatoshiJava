package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba 100 números inteiros reais. 
 * 			Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 * Programador: Roney Cacau
 * Data Criação: 24/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_EstRep38 {

	public static void main(String[] args) {
		int n, maior, menor;
		n=Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro positivo"));;
		while(n<0) {
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro positivo"));
		}
		maior = n;
		menor = n;
		for(int i = 1; i<100; i++) {
			do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro positivo"));
			}while(n<0);
			maior = n>maior?n:maior; 
			menor = n<menor?n:menor;
		}
		JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maior + " \n"
				+ "O menor número digitado foi: " + menor, "Muitos números, esses são os extremos", JOptionPane.INFORMATION_MESSAGE);
	}

}
