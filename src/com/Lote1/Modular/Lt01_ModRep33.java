package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModRep33 {

	public static void main(String[] args) {
		double n;
		n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número qualquer"));
		JOptionPane.showMessageDialog(null, s(n), "1/1+1/2+...+1/N", JOptionPane.INFORMATION_MESSAGE);
	}


	public static double s(double n){
		if(n==1) {
			return 1;
		}else{
			return 1/n + s(n-1);
		}
	}
}
