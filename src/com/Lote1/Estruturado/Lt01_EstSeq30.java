package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba a data de nascimento e atual em ano, mês e dia. 
 			Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
 * Programador: Roney Cacau
 * Data Criação: 28/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstSeq30 {

	public static void main(String[] args) {
		int idadeAno, idadeMes, idadeDia = 0, anoBisexto = 0;
		String dataNasc = JOptionPane.showInputDialog("Informe sua data de nascimento(DD/MM/AAAA)");
		int diaNasc = Integer.parseInt(dataNasc.substring(0,2));
		int mesNasc = Integer.parseInt(dataNasc.substring(3,5));
		int anoNasc = Integer.parseInt(dataNasc.substring(6,10));
		
		String dataAtual = JOptionPane.showInputDialog("Informe a data atual(DD/MM/AAAA)");
		int diaAtual = Integer.parseInt(dataAtual.substring(0,2));
		int mesAtual = Integer.parseInt(dataAtual.substring(3,5));
		int anoAtual = Integer.parseInt(dataAtual.substring(6,10));
		
		if(mesNasc>mesAtual) {
			idadeAno = 0;
		}else {
			idadeAno = anoAtual - anoNasc;
		}
		for(int i = anoNasc; anoNasc>=anoAtual; i++) {
			if((i%4 == 0 && i%100 != 0) || i%400 == 0) {
				anoBisexto++;
			}
		}
		if(mesNasc > mesAtual) {
			idadeMes = 12-mesAtual;
		}else if(mesAtual > mesNasc) {
			idadeMes = mesAtual - mesNasc;
		}else {
			idadeMes = 0;
		}
		
		if(diaAtual  == 29) {
			idadeDia = anoBisexto - 1;
		}
		if(mesNasc>= 2 && diaNasc >= 28) {
			idadeDia = anoBisexto;
		}
		
		switch(mesNasc) {
		case 2:
			idadeDia += (28+diaAtual)-diaNasc;
			break;
		case 4:case 6: case 9: case 11:
			idadeDia += (30+diaAtual)-diaNasc;
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			idadeDia += (31+diaAtual)-diaNasc;
			break;
		}
		String dia = idadeDia <2 ? "dia" : "dias";
		String mes = idadeMes <2 ? "mês" : "meses";
		String ano = idadeAno <2 ? "ano" : "anos";
		JOptionPane.showMessageDialog(null, "Sua idade é " + idadeAno + " " + ano + " " + idadeMes + " " + mes + " e " + idadeDia + " " + dia + ".");
	}
}
