package com.testedamas1.dominio;

import java.util.Vector;

public class Jogo {
	private int estadoJogo;
	private Tabuleiro tabuleiro;
	//private Vector<Peca> pecas;
	private Jogador[] jogadores;
	private Casa casaAtual;
	
	public Jogo(){
		jogadores = new Jogador[2];
		jogadores[0] = new Jogador(1);
		jogadores[1] = new Jogador(2);
		//tabuleiro = new Tabuleiro(jogadores[0],jogadores[1]);
		Vector<Peca> pecas = new Vector<Peca>();
		for(int i = 0; i < 12; i++){
			Peca peca1 = new Peca();
			peca1.setJogador(jogadores[0]);
			pecas.add(peca1);
		}
		for(int i = 12; i < 24; i++){
			Peca peca2 = new Peca();
			peca2.setJogador(jogadores[1]);
			pecas.add(peca2);
		}
		tabuleiro = new Tabuleiro(pecas);
	}
	
	public String getInstrucaoEstado(){
		switch(estadoJogo){
			case 0:
				return "Vez do Jogador 1 : Escolha qual peça será movimentada";
			case 1:
				return "Vez do Jogador 1 : Escolha o destino da peça a ser movimentada";
			case 2:
				return "Vez do Jogador 2 : Escolha qual peça será movimentada";
			case 3:
				return "Vez do Jogador 2 : Escolha o destino da peça a ser movimentada";
			case 4:
				if(GameOver() == 1){
					return "Jogador 1 Venceu !!!";
				}
				else{
					return "Jogador 2 Venceu !!!";
				}
		}
		return "--------";
	}
	
	public Tabuleiro getTabuleiro(){
		return tabuleiro;
	}
	
	public int getNumPecas1(){
		int numPecas1 = 0;
		for(int i = 0; i<tabuleiro.getCasas().length; i++){
			for(int j = 0; j<tabuleiro.getCasas()[i].length; j++){
				if(tabuleiro.getCasas()[i][j].getPeca() != null){
					if(tabuleiro.getCasas()[i][j].getPeca().getJogador() == jogadores[0])
						numPecas1++;
				}
			}
		}
		return numPecas1;
	}
	
	public int getNumPecas2(){
		int numPecas2 = 0;
		for(int i = 0; i<tabuleiro.getCasas().length; i++){
			for(int j = 0; j<tabuleiro.getCasas()[i].length; j++){
				if(tabuleiro.getCasas()[i][j].getPeca() != null){
					if(tabuleiro.getCasas()[i][j].getPeca().getJogador() == jogadores[1])
						numPecas2++;
				}
			}
		}
		return numPecas2;
	}
	
	public int getEstadoJogo() {
		return estadoJogo;
	}

	public void setEstadoJogo(int estadoJogo) {
		this.estadoJogo = estadoJogo;
	}
	
	public void Iniciar(){
		
	}
	
	public Vector<Jogada> ApresentarDestinoMovimento(int linhaOrigem, int colunaOrigem){
		/*for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				tabuleiro.getCasas()[i][j].setPossivelDestino(false);
			}
		}*/
		Casa origem = tabuleiro.getCasas()[linhaOrigem][colunaOrigem];
		Vector<Jogada> jogadas = new Vector<Jogada>();
		origem.getPeca().setJogada(jogadas);
		//Vector<Casa> casaAtacada = new Vector<Casa>();
		//Vector<Casa> casasAtaque = new Vector<Casa>();
		
		if(!origem.getPeca().isEhDama()){
			//Falta comer p/ trás
			if(origem.getPeca().getJogador() == jogadores[1]){
				if(colunaOrigem > 0 && linhaOrigem < 7){
					if(tabuleiro.getCasas()[linhaOrigem+1][colunaOrigem-1].getPeca() == null){
						Casa casaDestino = new Casa();
						casaDestino = tabuleiro.getCasas()[linhaOrigem+1][colunaOrigem-1];
						Jogada jogada = new Jogada();
						jogada.setCasaDestino(casaDestino);
						origem.getPeca().getJogadas().add(jogada);
					}
					else if(tabuleiro.getCasas()[linhaOrigem+1][colunaOrigem-1].getPeca().getJogador() == jogadores[0]){
						if(colunaOrigem > 1 && linhaOrigem < 6){
							if(tabuleiro.getCasas()[linhaOrigem+2][colunaOrigem-2].getPeca() == null){//Ativar Ataque
								Casa casaDestino = new Casa();
								Jogada jogada = new Jogada();
								casaDestino = tabuleiro.getCasas()[linhaOrigem+2][colunaOrigem-2];
								jogada.setCasaDestino(casaDestino);
								jogada.setCasaAtacada(tabuleiro.getCasas()[linhaOrigem+1][colunaOrigem-1]);
								origem.getPeca().getJogadas().add(jogada);
							}
						}
						
					}
				}
				if(colunaOrigem < 7 && linhaOrigem < 7){
					if(tabuleiro.getCasas()[linhaOrigem+1][colunaOrigem+1].getPeca() == null){
						Casa casaDestino = new Casa();
						casaDestino = tabuleiro.getCasas()[linhaOrigem+1][colunaOrigem+1];
						Jogada jogada = new Jogada();
						jogada.setCasaDestino(casaDestino);
						origem.getPeca().getJogadas().add(jogada);
					}
					else if(tabuleiro.getCasas()[linhaOrigem+1][colunaOrigem+1].getPeca().getJogador() == jogadores[0]){
						if(colunaOrigem < 6 && linhaOrigem < 6){
							if(tabuleiro.getCasas()[linhaOrigem+2][colunaOrigem+2].getPeca() == null){//Ativar Ataque
								Casa casaDestino = new Casa();
								Jogada jogada = new Jogada();
								casaDestino = tabuleiro.getCasas()[linhaOrigem+2][colunaOrigem+2];
								jogada.setCasaDestino(casaDestino);
								jogada.setCasaAtacada(tabuleiro.getCasas()[linhaOrigem+1][colunaOrigem+1]);
								origem.getPeca().getJogadas().add(jogada);
							}
						}
						
					}
				}
			}
			else if(origem.getPeca().getJogador() == jogadores[0]){
				if(colunaOrigem > 0 && linhaOrigem > 0){
					if(tabuleiro.getCasas()[linhaOrigem-1][colunaOrigem-1].getPeca() == null){
						Casa casaDestino = new Casa();
						casaDestino = tabuleiro.getCasas()[linhaOrigem-1][colunaOrigem-1];
						Jogada jogada = new Jogada();
						jogada.setCasaDestino(casaDestino);
						origem.getPeca().getJogadas().add(jogada);
					}
					else if(tabuleiro.getCasas()[linhaOrigem-1][colunaOrigem-1].getPeca().getJogador() == jogadores[1]){
						if(colunaOrigem > 1 && linhaOrigem > 1){
							if(tabuleiro.getCasas()[linhaOrigem-2][colunaOrigem-2].getPeca() == null){//Ativar Ataque
								Casa casaDestino = new Casa();
								Jogada jogada = new Jogada();
								casaDestino = tabuleiro.getCasas()[linhaOrigem-2][colunaOrigem-2];
								jogada.setCasaDestino(casaDestino);
								jogada.setCasaAtacada(tabuleiro.getCasas()[linhaOrigem-1][colunaOrigem-1]);
								origem.getPeca().getJogadas().add(jogada);

							}
						}
						
					}
				}
				if(colunaOrigem < 7 && linhaOrigem > 0){
					if(tabuleiro.getCasas()[linhaOrigem-1][colunaOrigem+1].getPeca() == null){
						Casa casaDestino = new Casa();
						casaDestino = tabuleiro.getCasas()[linhaOrigem-1][colunaOrigem+1];
						Jogada jogada = new Jogada();
						jogada.setCasaDestino(casaDestino);
						origem.getPeca().getJogadas().add(jogada);
					}
					else if(tabuleiro.getCasas()[linhaOrigem-1][colunaOrigem+1].getPeca().getJogador() == jogadores[1]){
						if(colunaOrigem < 6 && linhaOrigem > 1){
							if(tabuleiro.getCasas()[linhaOrigem-2][colunaOrigem+2].getPeca() == null){//Ativar Ataque
								Casa casaDestino = new Casa();
								Jogada jogada = new Jogada();
								casaDestino = tabuleiro.getCasas()[linhaOrigem-2][colunaOrigem+2];
								jogada.setCasaDestino(casaDestino);
								jogada.setCasaAtacada(tabuleiro.getCasas()[linhaOrigem-1][colunaOrigem+1]);
								origem.getPeca().getJogadas().add(jogada);

							}
						}
						
					}
				}
			}
		}
		else{//Dama
			//Nulo ; 1 oponente; 2 oponentes consecutivos; 2 oponentes distribuídos; 1 aliado 
			if(origem.getPeca().getJogador() == jogadores[1]){//Jogador 2
				if(colunaOrigem > 0 && linhaOrigem < 7){//Descendo diagonal auxiliar
					int linhaDest = linhaOrigem+1;
					int colunaDest = colunaOrigem-1;
					while(linhaDest <= 7 && colunaDest >=0){
						if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca() == null){//Nulo
							Casa casaDestino = new Casa();
							casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
							Jogada jogada = new Jogada();
							jogada.setCasaDestino(casaDestino);
							if(origem.getPeca().getJogadas().size() != 0){
								jogada.setCasaAtacada(origem.getPeca().getJogadas().get(origem.getPeca().getJogadas().size() - 1).getCasaAtacada());
							}
							origem.getPeca().getJogadas().add(jogada);
							linhaDest++;
							colunaDest--;
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[0]){//Oponente
							//if(colunaOrigem > 1 && linhaOrigem < 6){
							if(colunaDest > 0 && linhaDest < 7){
								if(tabuleiro.getCasas()[linhaDest+1][colunaDest-1].getPeca() == null){//Ativar Ataque
									linhaDest++;
									colunaDest--;
									Casa casaDestino = new Casa();
									Jogada jogada = new Jogada();
									casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
									jogada.setCasaDestino(casaDestino);
									jogada.setCasaAtacada(tabuleiro.getCasas()[linhaDest-1][colunaDest+1]);
									origem.getPeca().getJogadas().add(jogada);
								}
								else{
									linhaDest = 8;//Sai do while
								}
							}
							else{
								linhaDest = 8;//Sai do while
							}
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[1]){//Aliado
							linhaDest = 8; // Sai do while
						}
					}
				}
				if(colunaOrigem < 7 && linhaOrigem < 7){//Descendo diagonal principal
					int linhaDest = linhaOrigem+1;
					int colunaDest = colunaOrigem+1;
					while(linhaDest <= 7 && colunaDest <= 7){
						if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca() == null){
							Casa casaDestino = new Casa();
							casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
							Jogada jogada = new Jogada();
							jogada.setCasaDestino(casaDestino);
							if(origem.getPeca().getJogadas().size() != 0){
								jogada.setCasaAtacada(origem.getPeca().getJogadas().get(origem.getPeca().getJogadas().size() - 1).getCasaAtacada());
							}
							origem.getPeca().getJogadas().add(jogada);
							linhaDest++;
							colunaDest++;
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[0]){
							//if(colunaOrigem < 6 && linhaOrigem < 6){
							if(colunaDest < 7 && linhaDest < 7){
								if(tabuleiro.getCasas()[linhaDest+1][colunaDest+1].getPeca() == null){//Ativar Ataque
									linhaDest++;
									colunaDest++;
									Casa casaDestino = new Casa();
									Jogada jogada = new Jogada();
									casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
									jogada.setCasaDestino(casaDestino);
									jogada.setCasaAtacada(tabuleiro.getCasas()[linhaDest-1][colunaDest-1]);
									origem.getPeca().getJogadas().add(jogada);
								}
								else{
									linhaDest = 8;//Sai do while
								}
							}
							else{
								linhaDest = 8;//Sai do while
							}
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[1]){//Aliado
							linhaDest = 8; // Sai do while
						}

					}
				}
				if(colunaOrigem > 0 && linhaOrigem > 0){//Subindo diagonal principal
					int linhaDest = linhaOrigem-1;
					int colunaDest = colunaOrigem-1;
					while(linhaDest >= 0 && colunaDest >= 0){
						if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca() == null){
							Casa casaDestino = new Casa();
							casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
							Jogada jogada = new Jogada();
							jogada.setCasaDestino(casaDestino);
							if(origem.getPeca().getJogadas().size() != 0){
								jogada.setCasaAtacada(origem.getPeca().getJogadas().get(origem.getPeca().getJogadas().size() - 1).getCasaAtacada());
							}
							origem.getPeca().getJogadas().add(jogada);
							linhaDest--;
							colunaDest--;
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[0]){
							if(colunaDest > 0 && linhaDest > 0){
							//if(colunaOrigem > 1 && linhaOrigem > 1){
								if(tabuleiro.getCasas()[linhaDest-1][colunaDest-1].getPeca() == null){//Ativar Ataque
									linhaDest--;
									colunaDest--;
									Casa casaDestino = new Casa();
									Jogada jogada = new Jogada();
									casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
									jogada.setCasaDestino(casaDestino);
									jogada.setCasaAtacada(tabuleiro.getCasas()[linhaDest+1][colunaDest+1]);
									origem.getPeca().getJogadas().add(jogada);
								}
								else{
									linhaDest = -1;//Sai do while
								}
							}
							else{
								linhaDest = -1;//Sai do while
							}
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[1]){//Aliado
							linhaDest = -1; // Sai do while
						}

					}
				}
				if(colunaOrigem < 7 && linhaOrigem > 0){//Subindo diagonal auxiliar
					int linhaDest = linhaOrigem-1;
					int colunaDest = colunaOrigem+1;
					while(linhaDest >= 0 && colunaDest <= 7){
						if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca() == null){
							Casa casaDestino = new Casa();
							casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
							Jogada jogada = new Jogada();
							jogada.setCasaDestino(casaDestino);
							if(origem.getPeca().getJogadas().size() != 0){
								jogada.setCasaAtacada(origem.getPeca().getJogadas().get(origem.getPeca().getJogadas().size() - 1).getCasaAtacada());
							}
							origem.getPeca().getJogadas().add(jogada);
							linhaDest--;
							colunaDest++;
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[0]){
							//if(colunaOrigem < 6 && linhaOrigem > 1){
							if(colunaDest < 7 && linhaDest > 0){
								if(tabuleiro.getCasas()[linhaDest-1][colunaDest+1].getPeca() == null){//Ativar Ataque
									linhaDest--;
									colunaDest++;
									Casa casaDestino = new Casa();
									Jogada jogada = new Jogada();
									casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
									jogada.setCasaDestino(casaDestino);
									jogada.setCasaAtacada(tabuleiro.getCasas()[linhaDest+1][colunaDest-1]);
									origem.getPeca().getJogadas().add(jogada);
								}
								else{
									linhaDest = -1;//Sai do while
								}
							}
							else{
								linhaDest = -1;//Sai do while
							}
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[1]){//Aliado
							linhaDest = -1; // Sai do while
						}
					}
				}
			}
			else if(origem.getPeca().getJogador() == jogadores[0]){//Jogador 1
				if(colunaOrigem > 0 && linhaOrigem < 7){//Descendo diagonal auxiliar
					int linhaDest = linhaOrigem+1;
					int colunaDest = colunaOrigem-1;
					while(linhaDest <= 7 && colunaDest >=0){
						if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca() == null){
							Casa casaDestino = new Casa();
							casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
							Jogada jogada = new Jogada();
							jogada.setCasaDestino(casaDestino);
							if(origem.getPeca().getJogadas().size() != 0){
								jogada.setCasaAtacada(origem.getPeca().getJogadas().get(origem.getPeca().getJogadas().size() - 1).getCasaAtacada());
							}
							origem.getPeca().getJogadas().add(jogada);
							linhaDest++;
							colunaDest--;
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[1]){
							//if(colunaOrigem > 1 && linhaOrigem < 6){
							if(colunaDest > 0 && linhaDest < 7){
								if(tabuleiro.getCasas()[linhaDest+1][colunaDest-1].getPeca() == null){//Ativar Ataque
									linhaDest++;
									colunaDest--;
									Casa casaDestino = new Casa();
									Jogada jogada = new Jogada();
									casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
									jogada.setCasaDestino(casaDestino);
									jogada.setCasaAtacada(tabuleiro.getCasas()[linhaDest-1][colunaDest+1]);
									origem.getPeca().getJogadas().add(jogada);
								}
								else{
									linhaDest = 8;//Sai do while
								}
							}
							else{
								linhaDest = 8;//Sai do while
							}
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[0]){//Aliado
							linhaDest = 8; // Sai do while
						}
					}
				}
				if(colunaOrigem < 7 && linhaOrigem < 7){//Descendo diagonal principal
					int linhaDest = linhaOrigem+1;
					int colunaDest = colunaOrigem+1;
					while(linhaDest <= 7 && colunaDest <= 7){
						if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca() == null){
							Casa casaDestino = new Casa();
							casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
							Jogada jogada = new Jogada();
							jogada.setCasaDestino(casaDestino);
							if(origem.getPeca().getJogadas().size() != 0){
								jogada.setCasaAtacada(origem.getPeca().getJogadas().get(origem.getPeca().getJogadas().size() - 1).getCasaAtacada());
							}
							origem.getPeca().getJogadas().add(jogada);
							linhaDest++;
							colunaDest++;
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[1]){
							//if(colunaOrigem < 6 && linhaOrigem < 6){
							if(colunaDest < 7 && linhaDest < 7){
								if(tabuleiro.getCasas()[linhaDest+1][colunaDest+1].getPeca() == null){//Ativar Ataque
									linhaDest++;
									colunaDest++;
									Casa casaDestino = new Casa();
									Jogada jogada = new Jogada();
									casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
									jogada.setCasaDestino(casaDestino);
									jogada.setCasaAtacada(tabuleiro.getCasas()[linhaDest-1][colunaDest-1]);
									origem.getPeca().getJogadas().add(jogada);
								}
								else{
									linhaDest = 8;//Sai do while
								}
							}
							else{
								linhaDest = 8;//Sai do while
							}
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[0]){//Aliado
							linhaDest = 8; // Sai do while
						}
					}
				}
				if(colunaOrigem > 0 && linhaOrigem > 0){//Subindo diagonal principal
					int linhaDest = linhaOrigem-1;
					int colunaDest = colunaOrigem-1;
					while(linhaDest >= 0 && colunaDest >= 0){
						if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca() == null){
							Casa casaDestino = new Casa();
							casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
							Jogada jogada = new Jogada();
							jogada.setCasaDestino(casaDestino);
							if(origem.getPeca().getJogadas().size() != 0){
								jogada.setCasaAtacada(origem.getPeca().getJogadas().get(origem.getPeca().getJogadas().size() - 1).getCasaAtacada());
							}
							origem.getPeca().getJogadas().add(jogada);
							linhaDest--;
							colunaDest--;
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[1]){
							//if(colunaOrigem > 1 && linhaOrigem > 1){
							if(colunaDest > 0 && linhaDest > 0){
								if(tabuleiro.getCasas()[linhaDest-1][colunaDest-1].getPeca() == null){//Ativar Ataque
									linhaDest--;
									colunaDest--;
									Casa casaDestino = new Casa();
									Jogada jogada = new Jogada();
									casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
									jogada.setCasaDestino(casaDestino);
									jogada.setCasaAtacada(tabuleiro.getCasas()[linhaDest+1][colunaDest+1]);
									origem.getPeca().getJogadas().add(jogada);
								}
								else{
									linhaDest = -1;//Sai do while
								}
							}
							else{
								linhaDest = -1;//Sai do while
							}
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[0]){//Aliado
							linhaDest = -1; // Sai do while
						}
					}
				}
				if(colunaOrigem < 7 && linhaOrigem > 0){//Subindo diagonal auxiliar
					int linhaDest = linhaOrigem-1;
					int colunaDest = colunaOrigem+1;
					while(linhaDest >= 0 && colunaDest <= 7){
						if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca() == null){
							Casa casaDestino = new Casa();
							casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
							Jogada jogada = new Jogada();
							jogada.setCasaDestino(casaDestino);
							if(origem.getPeca().getJogadas().size() != 0){
								jogada.setCasaAtacada(origem.getPeca().getJogadas().get(origem.getPeca().getJogadas().size() - 1).getCasaAtacada());
							}
							origem.getPeca().getJogadas().add(jogada);
							linhaDest--;
							colunaDest++;
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[1]){
							//if(colunaOrigem < 6 && linhaOrigem > 1){
							if(colunaDest < 7 && linhaDest > 0){
								if(tabuleiro.getCasas()[linhaDest-1][colunaDest+1].getPeca() == null){//Ativar Ataque
									linhaDest--;
									colunaDest++;
									Casa casaDestino = new Casa();
									Jogada jogada = new Jogada();
									casaDestino = tabuleiro.getCasas()[linhaDest][colunaDest];
									jogada.setCasaDestino(casaDestino);
									jogada.setCasaAtacada(tabuleiro.getCasas()[linhaDest+1][colunaDest-1]);
									origem.getPeca().getJogadas().add(jogada);
								}
								else{
									linhaDest = -1;//Sai do while
								}
							}
							else{
								linhaDest = -1;//Sai do while
							}
						}
						else if(tabuleiro.getCasas()[linhaDest][colunaDest].getPeca().getJogador() == jogadores[0]){//Aliado
							linhaDest = -1; // Sai do while
						}
					}
				}
			}
		}
		
		this.setCasaAtual(origem);
		return origem.getPeca().getJogadas();
	}
	
	public void MovimentarPara(int linha, int coluna){
		/*if(estadoJogo == 1){
			
		}
		else if(estadoJogo == 3){
			
		}*/
		tabuleiro.getCasas()[linha][coluna].setPeca(casaAtual.getPeca());
		casaAtual.setPeca(null);
	}
	
	public boolean VerificarDama(int linha, int coluna){
		if(tabuleiro.getCasas()[linha][coluna].getPeca().getJogador() == jogadores[1] && linha == 7){
			tabuleiro.getCasas()[linha][coluna].getPeca().FazerDama();
			return true;
		}
		else if(tabuleiro.getCasas()[linha][coluna].getPeca().getJogador() == jogadores[0] && linha == 0){
			tabuleiro.getCasas()[linha][coluna].getPeca().FazerDama();
			return true;
		}
		else{
			return false;
		}
	}
	
	public int GameOver(){
		if(getNumPecas1() == 0)
			return -1;
		else if(getNumPecas2() == 0)
			return 1;
		else{
			return VerificaSeExisteJogada();
		}
		
	}
	
	public int VerificaSeExisteJogada(){
		int semJogada = 0;
		for(int i = 0; i<tabuleiro.getCasas().length; i++){
			for(int j = 0; j<tabuleiro.getCasas()[i].length; j++){
				if(tabuleiro.getCasas()[i][j].getPeca() != null){
					//if(tabuleiro.getCasas()[i][j].getPeca().getJogador() == jogadores[0] && tabuleiro.getCasas()[i][j].getPeca().getJogadas().size() == 0){
					if(tabuleiro.getCasas()[i][j].getPeca().getJogador() == jogadores[0] && this.ApresentarDestinoMovimento(i,j).size() == 0){
						semJogada++;
					}
				}
			}
		}
		if(semJogada == getNumPecas1())
			return -1;
		else{
			semJogada = 0;
			for(int i = 0; i<tabuleiro.getCasas().length; i++){
				for(int j = 0; j<tabuleiro.getCasas()[i].length; j++){
					if(tabuleiro.getCasas()[i][j].getPeca() != null){
						//if(tabuleiro.getCasas()[i][j].getPeca().getJogador() == jogadores[1] && tabuleiro.getCasas()[i][j].getPeca().getJogadas().size() == 0){
						if(tabuleiro.getCasas()[i][j].getPeca().getJogador() == jogadores[1] && this.ApresentarDestinoMovimento(i,j).size() == 0){
							semJogada++;
						}
					}
				}
			}
			if(semJogada == getNumPecas2())
				return 1;
			return 0;
		}
	}
	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}


	public Casa getCasaAtual() {
		return casaAtual;
	}

	public void setCasaAtual(Casa casaAtual) {
		this.casaAtual = casaAtual;
	}
}
