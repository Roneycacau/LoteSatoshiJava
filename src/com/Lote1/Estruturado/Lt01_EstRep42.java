package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 * Programador: Roney Cacau
 * Data Criação: 26/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep42 {

	public static void main(String[] args) {
		double n = 50, r;
		r = 0;
		for(double i = 1;i<=n;i++) {
			r +=(i / (i + (i-1)));
			System.out.println(i + "/(" + i + "+(" + (i-1) + ")");
		}
		JOptionPane.showMessageDialog(null, r, "1/1+1/2+...+1/N", JOptionPane.INFORMATION_MESSAGE);
		
	}
}