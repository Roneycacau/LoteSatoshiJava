package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep33 {

	public static void main(String[] args) {
		double n,r;
		n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número qualquer"));
		r = 0;
		for (double i = 1;i<=n;i++) {
			r += (1/i);
		}
		JOptionPane.showMessageDialog(null, r, "1/1+1/2+...+1/N", JOptionPane.INFORMATION_MESSAGE);
	}
}