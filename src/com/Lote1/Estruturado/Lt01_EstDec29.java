package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
 	 		Calcule e mostre o valor corrigido em 30 dias sabendo que a poupan�a = 3% e a renda fixa = 5%. 
 	 		Demais tipos não serão considerados.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstDec29 {
	public static void main(String args[]){
		int tipoDeInvestimento;
		double valorInvestimento, valorCorrigido;
		tipoDeInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de investimento\n 1 para poupança\n 2 para renda fixa"));
		valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser investido"));
		
		if(tipoDeInvestimento == 1) {
			valorCorrigido = valorInvestimento + (valorInvestimento * 0.03);
		}else if(tipoDeInvestimento == 2) {
			valorCorrigido = valorInvestimento + (valorInvestimento*0.05);
		}else {
			valorCorrigido = valorInvestimento;
		}
		JOptionPane.showMessageDialog(null, "Em 30 dias o valor investido, " + valorInvestimento + ", será " + valorCorrigido + ".", 
				"Poupança: 3%a.m. | RendaFixa: 5%a.m.", JOptionPane.INFORMATION_MESSAGE);
	}
}
