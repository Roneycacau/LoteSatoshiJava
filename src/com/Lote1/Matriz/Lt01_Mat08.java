package com.Lote1.Matriz;
/*
 *********************************************
 * Objetivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
 * 				a.	A quantidade de cada produto vendido no mês;
 * 				b.	A quantidade de produtos vendidos por semana;
 * 				c.	O total de produtos vendidos no mês
 * 
 * Autor: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_Mat08 {
	public static void main(String args[]) {
		int[][] matriz = new int[4][3];
		int op = 0, semana = 0, produto = 0;
		do {
			try {
				op = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada "
						+ "\n[1]Cadastrar Produtos"
						+ "\n[2]Quantidade do produto vendidos no mês"
						+ "\n[3]Quantidade de produtos vendidos na semana"
						+ "\n[4]Total Vendido no mês"
						+ "\n[9]Finalizar"));
				switch(op) {
				case 1:
					matriz = cadastrarProdutos(matriz);
					break;
				case 2:
					produto = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto desejado: [1],[2] ou [3]"));
					produtoVendidoMes(matriz, produto);
					break;
				case 3:
					semana = Integer.parseInt(JOptionPane.showInputDialog("Informe a semana desejada: [1],[2],[3] ou [4]"));
					produtoVendidoSemana(matriz, semana);
					break;
				case 4:
					totalVendido(matriz);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Finalizado", "Finito", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}catch(java.lang.NumberFormatException exeption) {
				JOptionPane.showMessageDialog(null, "Opção Inválida", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(op != 9);
		
	}
	
	public static int[][] cadastrarProdutos(int mat[][]) {
		for(int i = 0;i<mat.length;i++) {
			for(int j = 0;j<mat[0].length; j++) {
				mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de vendas do produto " + (j+1) + " na semana " + (i+1) + ":"));
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
		JOptionPane.showMessageDialog(null, "Cadastro concluido", "Cadastro de Produtos", JOptionPane.INFORMATION_MESSAGE);
		return mat;
	}
	
	public static void produtoVendidoSemana(int mat[][], int sem) {
		String menssagem = "";
		int total = 0;
		for(int j=0;j<mat[0].length;j++) {
			menssagem += "Produto " + (j+1) + ": " + mat[sem -1][j] + " \n";
			total += mat[sem - 1][j];
		}
		JOptionPane.showMessageDialog(null, menssagem + " \nTotal: " + total);
	}
	
	public static void produtoVendidoMes(int mat[][], int prod) {
		String menssagem = "";
		int total = 0;
		for(int i=0;i<mat.length;i++) {
			menssagem += "Semana " + (i+1) + ": " + mat[i][prod-1] + " \n";
			total += mat[i][prod-1];
		}
		JOptionPane.showMessageDialog(null, menssagem + " \nTotal: " + total);
	}
	
	public static void totalVendido(int mat[][]) {
		int total = 0;
		for (int[] vet : mat) {
			for(int i : vet) {
				total += i;
			}
		}
		JOptionPane.showMessageDialog(null, "Total Vendido no mês: " + total);
	}
}
