package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_EstSeq15 {

	public static void main(String[] args) {
		double a, b, h,h2;
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do cateto adjacente"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do cateto opositor"));
		h2 = (a*a)+(b*b);
		h = Math.sqrt(h2);
		JOptionPane.showMessageDialog(null, a + "²+" + b + "²=" + h + "².\n"
				+ "Logo, " + a*a + "+" + b*b + "=" + h2 + ". Sendo o valor da hipotenusa " + h + ".", "a²=b²+c²", JOptionPane.INFORMATION_MESSAGE);
	}

}
