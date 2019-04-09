package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba o sal�rio de um funcion�rio e mostre o novo salário com reajuste de 15%
 * Programador: Roney Cacau
 * Data Criação: 07/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstSeq02 {

	public static void main(String[] args) {
		double salario, novoSalario;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário atual"));
		novoSalario = salario + (salario*0.15);
		JOptionPane.showMessageDialog(null, "O salário " + salario + " com reajuste de 15% � " + novoSalario);
	}

}
