package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * Programador: Roney Cacau
 * Data Crição: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_ModDec22 {

	static int a,b;

	public static void main(String[] args) {
		capturarInformacao();
		compararExibir();
	}

	
	static void capturarInformacao() {
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um número diferente"));
	}
	
	static void compararExibir() {
		if(a<b) {
			JOptionPane.showMessageDialog(null, "Em ordem crescente os números digitados foram:\n"
					+ " " + a + " \n " + b, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Em ordem crescente os números digitados foram:\n"
					+ " " + b + " \n " + a, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
		}
	}
}