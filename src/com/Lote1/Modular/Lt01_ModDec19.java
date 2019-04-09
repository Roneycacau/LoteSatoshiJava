package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModDec19 {
	
	static double a, b;
	public static void main(String[] args) {
		capturarInformacoes();
		comparar();
		menssagem();
	}
	
	
	static void capturarInformacoes() {
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe um  número qualquer"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe um  número qualquer"));
		
	}

	static void comparar() {
		if(a>b) {
			JOptionPane.showMessageDialog(null, "O maior número digitado foi " + a + ".","Você digitou " + a + " e " + b, JOptionPane.INFORMATION_MESSAGE);
		}else {
		}
		
	}
	
	static void menssagem() {
		JOptionPane.showMessageDialog(null, "O maior número digitado foi " + b + ".","Você digitou " + a + " e " + b, JOptionPane.INFORMATION_MESSAGE);
		
	}
}