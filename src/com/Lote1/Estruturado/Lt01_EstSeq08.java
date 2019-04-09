package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba o valor de um depósito em poupança. 
 * Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_EstSeq08 {
	public static void main(String args[]) {
		double deposito, rendimento, saldo;
		//int quantidadeDeMeses;
		saldo = 0;
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito"));
		//quantidadeDeMeses = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de meses que irá render"));
		rendimento = 0.013;
		saldo +=  deposito;
		//for (int i=0; i<quantidadeDeMeses; i++){
			saldo += (saldo*rendimento);
		//}
		JOptionPane.showMessageDialog(null, "Após"+ 1 +" mes o valor depositado será " + saldo + ".",
				rendimento + "a.m", JOptionPane.INFORMATION_MESSAGE);
	}
}
