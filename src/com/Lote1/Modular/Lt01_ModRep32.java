package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_ModRep32 {

	public static void main(String[] args) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		
		JOptionPane.showMessageDialog(null, n + "!="+fatorial(n));
		}
	
	public static int fatorial(int n) {
		return n== 1? n: n * fatorial(n-1);
	}
}