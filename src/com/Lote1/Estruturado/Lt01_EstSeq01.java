package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Coletar o valor do lado de um quadrado, calcular sua �rea e apresentar o resultado
 * Programador: Roney Cacau
 * Data Criação: 07/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstSeq01 {

	public static void main(String[] args) {
		double lado, area;
		lado = Double.parseDouble(JOptionPane.showInputDialog("Informe a área do Quadrado"));
		area = lado*lado;
		JOptionPane.showMessageDialog(null, "A área do Quadrado é " + area);
	}

}
