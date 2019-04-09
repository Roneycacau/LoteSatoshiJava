package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 * Programador: Roney Cacau
 * Data Criação: 24/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModRep37 {

	public static void main(String[] args) {
		int tn;
		tn = Integer.parseInt(JOptionPane.showInputDialog("Informe qual termo da sequência Fibonacci deseja saber"));
		JOptionPane.showMessageDialog(null, calculaFibonacci(tn), tn + "º Termo", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int calculaFibonacci(int n) {
		if(n<=2){
			return 1;
		}else {
		return calculaFibonacci(n-1) + calculaFibonacci(n-2);	
		}
	}

}
