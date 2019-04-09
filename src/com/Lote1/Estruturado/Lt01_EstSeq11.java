package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba o raio de uma circunfer�ncia. Calcule e mostre o comprimento da circunferência.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_EstSeq11 {

	public static void main(String[] args) {
		double circunferencia, raio;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da circunferência (em cm)"));
		circunferencia = 2*Math.PI*raio;

		JOptionPane.showMessageDialog(null, "A circunferência para esse o raio " + raio + "cm é " + circunferencia + "cm.", 
				"dois pirraio...", JOptionPane.INFORMATION_MESSAGE);

	}

}
