package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModDec24 {

	static int a;
	public static void main(String[] args) {
	entrarInformacao();
	compararExibir();
	}
	
	static void entrarInformacao() {
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
	}
	
	static void compararExibir() {
		if(a%2 == 0 && a%3 == 0) {
			JOptionPane.showMessageDialog(null, "O número é divisivel por 2 e por 3",
					"Número = " + a, JOptionPane.INFORMATION_MESSAGE);
		}else if(a%2 == 0 && a%3 != 0) {
			JOptionPane.showMessageDialog(null, "O n�mero � divisivel por 2 mas não por 3", 
					"Número = " + a, JOptionPane.INFORMATION_MESSAGE);
		}else if(a%2 != 0 && a%3 == 0) {
			JOptionPane.showMessageDialog(null, "O número não é divisivel por 2 mas é divisivel por 3",
					"Número = " + a, JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "O número não é divisivel por 2 nem por 3", 
					"Número = " + a, JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
