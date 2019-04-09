package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 * Programador: Roney Cacau
 * Data Criação: 28/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModRep44 {

	public static void main(String[] args) {
		int base, expoente;
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base"));
		expoente = Integer.parseInt(JOptionPane.showInputDialog("Informe o expoente"));
		JOptionPane.showMessageDialog(null,"O resultado é: " + potencia(base, expoente) + " ", base + " ^ " + expoente,JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int potencia(int base, int exp) {
		int resultado =(int)Math.pow(base, exp) ; 
		return resultado;
	}
}