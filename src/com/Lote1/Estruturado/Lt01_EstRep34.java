package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep34 {

	public static void main(String[] args) {
		int n,r;
		String tabuada = "\n";
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para receber a tabuada"));
		for(int i=10;i>=0;i--) {
			r = n * i;
			tabuada = n+"x"+i+"="+r+"\n"+tabuada;
		}
		JOptionPane.showMessageDialog(null, tabuada, "Tabuada do " + n, JOptionPane.INFORMATION_MESSAGE);
	}

}