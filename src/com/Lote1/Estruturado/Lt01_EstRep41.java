package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 * Programador: Roney Cacau
 * Data Criação: 26/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep41 {

	public static void main(String[] args) {
		String m;
		m = "Segue as possibilidades que a soma de dois dados de seis lados seja 7 \n"
				+ "Dado1 | Dado2 \n";
		for(int i = 1;i<=6;i++) {
			for(int j = 6; j>=4;j--) {
				if(j+i == 7) {
					m += "   "+j + "      +     " + i + "\n" + "   " + i + "      +     " + j + "\n";
				}
			}
		}
		JOptionPane.showMessageDialog(null,m,"Tem dado? :v ",JOptionPane.INFORMATION_MESSAGE);
	}
}