package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModDec26 {

	static int a, b;
	public static void main(String[] args) {
		capturarInformacao();
		calcularExibir();
	}

	static void capturarInformacao() {
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		
	}
	
	static void calcularExibir() {
		if(a>b) {
			if(a%b == 0) {
				JOptionPane.showMessageDialog(null, a + " é Múltiplo de " + b, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, a + " não é Múltiplo de " + b, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
				
			}
		}else {
			if(b%a == 0) {
				JOptionPane.showMessageDialog(null, b + " é Múltiplo de " + a, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, b + " não é Múltiplo de " + a, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
				
			}
		}
	}
}
