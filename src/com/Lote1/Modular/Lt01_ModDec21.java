package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
 * 			Mostre a mensagem de acordo com a média:
			a.	Se a média for >= 6,0 exibir "APROVADO";
			b.	Se a média for >= 3,0 ou < 6,0 exibir "EXAME";
			c.	Se a média for < 3,0 exibir "RETIDO".
 
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModDec21 {

	static double n1, n2, n3, n4, media;
	public static void main(String[] args) {
	}

	static void capturarInformacoes() {
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 1"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 2"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 3"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 4"));
	}
	
	static void calcularEExibir() {	
		media = (n1 + n2 + n3 + n4) / 4;
		if(media>=6) {
			JOptionPane.showMessageDialog(null, "Média = " + media + " \n Aluno APROVADO", "Status", JOptionPane.INFORMATION_MESSAGE);
		}else if(media>=3 && media<6) {
			JOptionPane.showMessageDialog(null, "Média = " + media + " \n Aluno de EXAME", "Status", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Média = " + media + "\n Aluno REPROVADO", "Status", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}

