package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstDec19 {

	public static void main(String[] args) {
		double a, b;
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe um  número qualquer"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe um  número qualquer"));
		
		if(a>b) {
			JOptionPane.showMessageDialog(null, "O maior número digitado foi " + a + ".",
					"Você digitou " + a + " e " + b, JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "O maior número digitado foi " + b + ".",
					"Você digitou " + a + " e " + b, JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
