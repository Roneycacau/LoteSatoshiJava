package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba um número. Calcule e mostre a série 1! + 1/2! + 1/3! + ... + 1/N!.
 * Programador: Roney Cacau
 * Data Criação: 24/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep36 {
	public static void main(String[] args) {
		double n, r, fatorial,num;
		int f = 1;
		n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número qualquer"));
		r=0;
		fatorial = 0;
		num = n;
		for (double i = 1;i<=n;i++) {
			for (double j = num; j>=1; j--) {
				f *= j;
			}
			fatorial = f;
			f = 1;
			num -=1;
			r += (1/fatorial);
		}
		JOptionPane.showMessageDialog(null, r, "1! + 1/2!+ ... + 1/N!", JOptionPane.INFORMATION_MESSAGE);
	}
}