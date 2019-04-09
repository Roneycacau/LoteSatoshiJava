package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit (F = (9*C+160)/5)
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstSeq04 {

	public static void main(String[] args) {
		double c, f;
		c = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Celsius"));
		f = (9*c+160)/5;
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é " + f + "ºF.");
	}

}
