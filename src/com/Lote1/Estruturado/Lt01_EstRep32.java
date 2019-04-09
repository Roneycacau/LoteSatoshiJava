package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_EstRep32 {

	public static void main(String[] args) {
		int n, fatorial;
		fatorial = 1;
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		for(int i=1; i<=n; i++) {
			fatorial *= i;
		}
		JOptionPane.showMessageDialog(null, n + "!="+fatorial);
	}
}