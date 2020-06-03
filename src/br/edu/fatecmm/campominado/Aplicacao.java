package br.edu.fatecmm.campominado;

import br.edu.fatecmm.campominado.modelo.Tabuleiro;
import br.edu.fatecmm.campominado.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6,6,3);
		
		new TabuleiroConsole(tabuleiro);
		
	}
}
