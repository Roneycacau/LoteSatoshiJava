package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba a base e a altura de um tri�ngulo. Calcule e mostre sua �rea
 * Programador: Roney Cacau
 * Data Criação: 07/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstSeq03 {
	public static void main(String[] args) {
		double base, altura, area;
		base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do triângulo"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do triângulo"));
		area = (base * altura)/2;
		
		JOptionPane.showMessageDialog(null, "A área de triângulo de base " + base + " e altura " + altura + " � " + area);
	}
}
