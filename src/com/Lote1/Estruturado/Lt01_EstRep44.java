package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 * Programador: Roney Cacau
 * Data Criação: 28/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep44 {

	public static void main(String[] args) {
		int base, expoente;
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base"));
		expoente = Integer.parseInt(JOptionPane.showInputDialog("Informe o expoente"));
		JOptionPane.showMessageDialog(null,"O resultado é: " + (int)Math.pow(base, expoente) + " ", base + " ^ " + expoente,JOptionPane.INFORMATION_MESSAGE);
	}
}