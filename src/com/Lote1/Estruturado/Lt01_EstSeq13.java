package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba a quantidade de alimento em quilos. 
 * 			Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_EstSeq13 {
	public static void main(String args[]) {
		double qntdAlimento, alimentoEmG, dia;
		int dias;
		qntdAlimento = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de alimento total (em Kg"));
		alimentoEmG = qntdAlimento*1000;
		dia = alimentoEmG / 50;
		dias = (int) dia;
		JOptionPane.showMessageDialog(null, qntdAlimento + "kg, consumindo 50g por dia, durará " + dias + ".", 
				"BRILL", JOptionPane.INFORMATION_MESSAGE);
	}
}
