package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Primeiro Programa em Java
 * Programador: Roney Cacau
 * Data Cria��o: 07/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstSeqExemplo01 {

	public static void main(String[] args) {
		int a,b,c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B"));
		c = a + b;
		JOptionPane.showMessageDialog(null, "O valor de C � " + c);
	}

}
