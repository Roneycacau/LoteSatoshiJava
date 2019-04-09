package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_EstSeq14 {
	public static void main(String args[]) {
		double a,b,c;
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do angulo A"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do angulo B"));
		c = 180-(a+b);
		JOptionPane.showMessageDialog(null, "O ângulo C é " + c + ".", "A=" + a + ". B=" + b, JOptionPane.INFORMATION_MESSAGE);
	}

}
