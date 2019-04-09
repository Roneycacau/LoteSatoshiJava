package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo:  
 * Programador: Roney Cacau
 * Data Criação: 26/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModRep45 {

	public static void main(String[] args) {
		double n = 15;
		JOptionPane.showMessageDialog(null, s(n), "1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225", JOptionPane.INFORMATION_MESSAGE);
	}
	public static double s(double n) {
		if(n==1) {
			return n;
		}else {
			System.out.println(n+"/("+n*n+")");
			System.out.println(n/(n*n));
			return n/(n*n) + s(n-1);
		}
	}
}
