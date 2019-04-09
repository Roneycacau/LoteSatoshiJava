package com.Lote1.Estruturado;	
/*
 *********************************************
 * Objetivo:  
 * Programador: Roney Cacau
 * Data Criação: 26/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep45 {

	public static void main(String[] args) {
		double s = 0;
		for(int i = 1; i<=15;i++) {
			s += i/(Math.pow(i, 2));
		}
		JOptionPane.showMessageDialog(null, s, "1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225", JOptionPane.INFORMATION_MESSAGE);
	}
}
