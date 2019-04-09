package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 * Programador: Roney Cacau
 * Data Criação: 26/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_ModRep42 {
	public static void main(String[] args) {
		double n;
		n = 50;
		JOptionPane.showMessageDialog(null, s(n), "1/1+1/2+...+1/N", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public static double s(double n) {
		if(n==1) {
			System.out.println(n);
			return n;
		}else {
			System.out.println(n + "/(" + n + "+(" + (n-1) + ")");
			return n/(n+(n-1)) + s(n-1);
		}
	}
}
