package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 * Programador: Roney Cacau
 * Data Criação: 24/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep37 {

	public static void main(String[] args) {
		int tn,t1, t2, fibonacci;
		do {
			tn = Integer.parseInt(JOptionPane.showInputDialog("Informe qual termo da sequência Fibonacci deseja saber"));
		}while(tn<=0);
		t1 = 1;
		t2 = 1;
		fibonacci = 0;
		if(tn == 1 || tn == 2) {
			fibonacci = 1;
		}else {
			for(int i = 3; i<=tn; i++) { 
				fibonacci = t1 + t2;
				t1 = t2;	
				t2 = fibonacci;
			}
		}
		
		JOptionPane.showMessageDialog(null, fibonacci, tn + "º Termo", JOptionPane.INFORMATION_MESSAGE);
	}
}
