package br.edu.fatecmm.campominado.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.edu.fatecmm.campominado.excecao.ExplosaoException;
import br.edu.fatecmm.campominado.excecao.SairException;
import br.edu.fatecmm.campominado.modelo.Tabuleiro;

public class TabuleiroConsole {
	
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
			
			
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			
			while(continuar) {
				
				loopDoJogo();
				
				System.out.println("Outra partida? (S/N)");
				String resposta = entrada.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
			
		}catch(SairException e) { //caso queira sair no meio do jogo;
			System.out.println("Jogo finalizado!");
		} finally {
			entrada.close();
		}
	}

	private void loopDoJogo() {
		try {
			
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (x,y)"); //Pegar os valores das coordenadas
				
				Iterator<Integer> xy = Arrays.stream(digitado.split(",")) //Armazenar em xy
						.map(e -> Integer.parseInt(e.trim())).iterator();
				
				digitado = capturarValorDigitado("1 -> abrir ou 2 -> Marcar ou desmarcar: "); //Verificar qual ação usuario deseja
				
				if("1".equals(digitado)) { //verifica ação desejada
					tabuleiro.abrir(xy.next(), xy.next());
				} else if ("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(xy.next(), xy.next());
				}
			}
			System.out.println(tabuleiro);
			System.out.println("Você ganhou!!!!!!");
		} catch(ExplosaoException e) {
			System.out.println(tabuleiro); //mostra o tabuleiro com todas os camposa abertos
			System.out.println("Você perdeu!");
		}
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.println(texto);
		String digitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) { //caso digite sair lança exceção e para o fluxo
			throw new SairException();
		}
		
		return digitado;
	}
}
