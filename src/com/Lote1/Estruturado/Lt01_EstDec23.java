package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
 * 			Mostre os 4 números em ordem crescente.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstDec23 {

	public static void main(String[] args) {
		double a, b, c, d;
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe um número qualquer"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe um número maior que o anterior"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Informe um número maior que o anterior"));
		d = Double.parseDouble(JOptionPane.showInputDialog("Informe um número qualquer"));
		
		if(d>=c) {
			JOptionPane.showMessageDialog(null, a + "\n " + b + "\n " + c + "\n " + d + "\n",
					"A = " + a + " | B = " + b + " | C = " + c + " | D = " +d, JOptionPane.INFORMATION_MESSAGE);
		}else if(d>=b && d<=c) {
			JOptionPane.showMessageDialog(null, a + "\n " + b + "\n " + d + "\n " + c + "\n",
					"A = " + a + " | B = " + b + " | C = " + c + " | D = " +d, JOptionPane.INFORMATION_MESSAGE);
		}else if(d>=a && d<=b) {
			JOptionPane.showMessageDialog(null, a + "\n " + d + "\n " + b + "\n " + c + "\n",
					"A = " + a + " | B = " + b + " | C = " + c + " | D = " +d, JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, d + "\n " + a + "\n " + b + "\n " + c + "\n",
					"A = " + a + " | B = " + b + " | C = " + c + " | D = " +d, JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

}
