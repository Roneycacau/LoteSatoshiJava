package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModRep34 {

	public static void main(String[] args) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para receber a tabuada"));
		JOptionPane.showMessageDialog(null, tabuada(n), "Tabuada do " + n, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static String tabuada(int n) {
		String resultado = "\n";
		for(int i=10;i>=0;i--) {
			int r = n * i;
			resultado = n+"x"+i+"="+r+"\n"+resultado;
		}
		return resultado;
	}

}
