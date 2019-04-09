package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
			Venda Mensal		Pre�o Atual		Pre�o Novo
				< 500				< 30		+ 10%
			>= 500 e < 1000		>= 30 e < 80	+15%
				>= 1000				>= 80		- 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstDec28 {

	public static void main(String[] args) {
		double precoAtual, vendaMensal, novoPreco;
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual"));
		vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe a venda média mensal"));
		
		if(vendaMensal<500 && precoAtual<30) {
			novoPreco = precoAtual + (precoAtual*0.1);
		}else if(vendaMensal>=500 && vendaMensal<1000 && precoAtual>=30 && precoAtual<80) {
			novoPreco = precoAtual + (precoAtual * 0.15);
		}else if(vendaMensal>=1000 && precoAtual>=80) {
			novoPreco = precoAtual - (precoAtual * 0.05);
		}else {
			novoPreco = precoAtual;
		}
		JOptionPane.showMessageDialog(null, "A média das vendas do mês foi: " + vendaMensal + "\n"
				+ "O preço atual é: " + precoAtual + "\n"
				+ "O novo preço será: " + novoPreco, "Novos Preços", JOptionPane.INFORMATION_MESSAGE);
	}

}
