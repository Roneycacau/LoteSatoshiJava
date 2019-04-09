package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_EstSeq12 {

	public static void main(String[] args) {
		int anoNascimento, anoAtual, idade, idadeFutura;
		
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu nascimento"));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano atual"));
		idade = anoAtual - anoNascimento;
		idadeFutura = idade + 17;
		JOptionPane.showMessageDialog(null, "Sua idade em " + anoAtual + " é " + idade + ". \n "
				+ "Em " + (anoAtual+17) + " anos sera " + idadeFutura + ".", 
				"Velho hoje, velho amanh�, velho sempre!", JOptionPane.INFORMATION_MESSAGE);
	}

}