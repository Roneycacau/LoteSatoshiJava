package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba um número. Calcule e mostre a série 1! + 1/2! + 1/3! + ... + 1/N!.
 * Programador: Roney Cacau
 * Data Criação: 24/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModRep36 {

	public static void main(String[] args) {
		double n, r;
		n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número qualquer"));
		r=0;
		for (double i = 1;i<=n;i++) {
			r += (1/fatorial(i));
		}
		JOptionPane.showMessageDialog(null, r, "1! + 1/2!+ ... + 1/N!", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static double fatorial(double n) {
		if(n==0) {
			return 1;
		}else {
			return n * fatorial(n-1);
		}
	}
}