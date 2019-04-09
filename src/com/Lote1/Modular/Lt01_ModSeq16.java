package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
 * 			Calcule o salário que ser�o as horas trabalhadas x o valor por hora. 
 * 			Calcule o salário líquido (= Salário Bruto � desconto). 
 * 			A cada dependente será acrescido R$ 100 no Salário Líquido. 
 * 			Exiba o salário a receber.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_ModSeq16 {
		static int qntHorasTrabalhadas, qntdDependentes;
		static double valorHora, desconto, salarioBruto, salarioLiquido, salarioAReceber;
		
		public static void main(String args[]) {
		
		qntHorasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de horas trabalhadas"));
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor pago por hora"));
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto"))/100;
		qntdDependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dependentes"))*100;
		calcularSalario();
		mostrar();
		
	}
	static void calcularSalario() {
		salarioBruto = qntHorasTrabalhadas * valorHora;
		salarioLiquido = salarioBruto - (salarioBruto*desconto);
		salarioAReceber = salarioLiquido + qntdDependentes;
	}
	
	static void mostrar() {
		JOptionPane.showMessageDialog(null, 
				"Horas Trabalhadas: " + qntHorasTrabalhadas + "h \n"
				+ "Valor Hora: R$ " + valorHora + " \n"
				+ "Desconto: " + desconto*100 + "% \n"
				+ "Dependentes: " + qntdDependentes/100 + " \n"
				+ "Salário Bruto: R$ " + salarioBruto + " \n"
				+ "Salário Líquido: R$ " + salarioLiquido + " \n"
				+ "Total à receber: R$ " + salarioAReceber, "Cálculo Salário", JOptionPane.INFORMATION_MESSAGE);
	}
}