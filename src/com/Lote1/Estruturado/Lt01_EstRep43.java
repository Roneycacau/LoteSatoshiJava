package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria 
 			sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 * Programador: Roney Cacau
 * Data Criação: 26/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;   

public class Lt01_EstRep43 {

	public static void main(String[] args) { 
		double maria = 1.5;
		int ano = 0;
		double ana = 1.1;
		for(ana = 1.1; ana < maria; ano++) {
			ana += 0.03;
			maria += 0.02;
		}
		DecimalFormat df = new DecimalFormat("0.##");
		String anaF = df.format(ana);
		String mariaF = df.format(maria);
		JOptionPane.showMessageDialog(null, "Demorará " + ano + " anos para ana ser maior que Maria", "Ana " + anaF + " || Maria " + mariaF, JOptionPane.INFORMATION_MESSAGE);
	}
}