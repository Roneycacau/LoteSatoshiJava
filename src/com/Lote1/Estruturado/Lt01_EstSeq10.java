package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_EstSeq10 {
	public static void main(String args[]) {
		int a, b, diferenca;
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro"));
		diferenca = a - b;
		JOptionPane.showMessageDialog(null, a + "-" + b + "=" + diferenca,
				"Diferença é o resultado da Subtração", JOptionPane.INFORMATION_MESSAGE);
	}

}
