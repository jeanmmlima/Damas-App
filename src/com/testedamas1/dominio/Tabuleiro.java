package com.testedamas1.dominio;

import java.util.Vector;

public class Tabuleiro {
	private Casa[][] casa;
	private int linhaOrigem;
	private int colunaOrigem;
	private int linhaAmeacada;
	private int colunaAmeacada;
	
	/*private int numPecas1;
	private int numPecas2;
	private int estadoJogo;*/

	public Tabuleiro(Vector<Peca> pecas){
	//public Tabuleiro(Jogador jogador1, Jogador jogador2){
		//IniciarCasas(jogador1, jogador2);
		//setNumPecas1(12);
		//setNumPecas2(12);
		IniciarCasas(pecas);
	}
	
	/*public Tabuleiro(){
		IniciarCasas();
		//setNumPecas1(12);
		//setNumPecas2(12);
	}*/
	
	public Casa[][] getCasas() {
		return casa;
	}
	//public void setValor(int valor) {
	//	this.valor = valor;
	//}
	

	
	public int getLinhaOrigem() {
		return linhaOrigem;
	}

	public void setLinhaOrigem(int linhaOrigem) {
		this.linhaOrigem = linhaOrigem;
	}

	public int getColunaOrigem() {
		return colunaOrigem;
	}

	public void setColunaOrigem(int colunaOrigem) {
		this.colunaOrigem = colunaOrigem;
	}

	public int getLinhaAmeacada() {
		return linhaAmeacada;
	}

	public void setLinhaAmeacada(int linhaAmeacada) {
		this.linhaAmeacada = linhaAmeacada;
	}

	public int getColunaAmeacada() {
		return colunaAmeacada;
	}

	public void setColunaAmeacada(int colunaAmeacada) {
		this.colunaAmeacada = colunaAmeacada;
	}
	
	//private void IniciarCasas(Jogador jogador1, Jogador jogador2){
	//private void IniciarCasas(){
	private void IniciarCasas(Vector<Peca> pecas){
		this.casa = new Casa[8][8];
		
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				casa[i][j] = new Casa();
			}
		}
		
		casa[0][0].setPeca(null);
		casa[0][0].setColuna(0);
		casa[0][0].setLinha(0);
		
		casa[0][1].setPeca(pecas.get(12));
		casa[0][1].setColuna(1);
		casa[0][1].setLinha(0);
		
		casa[0][2].setPeca(null);
		casa[0][2].setColuna(2);
		casa[0][2].setLinha(0);
		
		casa[0][3].setPeca(pecas.get(13));
		casa[0][3].setColuna(3);
		casa[0][3].setLinha(0);
		
		casa[0][4].setPeca(null);
		casa[0][4].setColuna(4);
		casa[0][4].setLinha(0);
		
		casa[0][5].setPeca(pecas.get(14));
		casa[0][5].setColuna(5);
		casa[0][5].setLinha(0);
		
		casa[0][6].setPeca(null);
		casa[0][6].setColuna(6);
		casa[0][6].setLinha(0);
		
		casa[0][7].setPeca(pecas.get(15));
		casa[0][7].setColuna(7);
		casa[0][7].setLinha(0);
		
		
		casa[1][0].setPeca(pecas.get(16));
		casa[1][0].setColuna(0);
		casa[1][0].setLinha(1);
		
		casa[1][1].setPeca(null);
		casa[1][1].setColuna(1);
		casa[1][1].setLinha(1);
		
		casa[1][2].setPeca(pecas.get(17));
		casa[1][2].setColuna(2);
		casa[1][2].setLinha(1);
		
		casa[1][3].setPeca(null);
		casa[1][3].setColuna(3);
		casa[1][3].setLinha(1);
		
		casa[1][4].setPeca(pecas.get(18));
		casa[1][4].setColuna(4);
		casa[1][4].setLinha(1);
		
		casa[1][5].setPeca(null);
		casa[1][5].setColuna(5);
		casa[1][5].setLinha(1);
		
		casa[1][6].setPeca(pecas.get(19));
		casa[1][6].setColuna(6);
		casa[1][6].setLinha(1);
		
		casa[1][7].setPeca(null);
		casa[1][7].setColuna(7);
		casa[1][7].setLinha(1);
		
		casa[2][0].setPeca(null);
		casa[2][0].setColuna(0);
		casa[2][0].setLinha(2);
		
		casa[2][1].setPeca(pecas.get(20));
		casa[2][1].setColuna(1);
		casa[2][1].setLinha(2);
		
		casa[2][2].setPeca(null);
		casa[2][2].setColuna(2);
		casa[2][2].setLinha(2);
		
		casa[2][3].setPeca(pecas.get(21));
		casa[2][3].setColuna(3);
		casa[2][3].setLinha(2);
		
		casa[2][4].setPeca(null);
		casa[2][4].setColuna(4);
		casa[2][4].setLinha(2);
		
		casa[2][5].setPeca(pecas.get(22));
		casa[2][5].setColuna(5);
		casa[2][5].setLinha(2);
		
		casa[2][6].setPeca(null);
		casa[2][6].setColuna(6);
		casa[2][6].setLinha(2);
		
		casa[2][7].setPeca(pecas.get(22));
		casa[2][7].setColuna(7);
		casa[2][7].setLinha(2);
		

		casa[3][0].setPeca(null);
		casa[3][0].setColuna(0);
		casa[3][0].setLinha(3);
		
		casa[3][1].setPeca(null);
		casa[3][1].setColuna(1);
		casa[3][1].setLinha(3);
		
		casa[3][2].setPeca(null);
		casa[3][2].setColuna(2);
		casa[3][2].setLinha(3);
		
		casa[3][3].setPeca(null);
		casa[3][3].setColuna(3);
		casa[3][3].setLinha(3);
		
		casa[3][4].setPeca(null);
		casa[3][4].setColuna(4);
		casa[3][4].setLinha(3);
		
		casa[3][5].setPeca(null);
		casa[3][5].setColuna(5);
		casa[3][5].setLinha(3);
		
		casa[3][6].setPeca(null);
		casa[3][6].setColuna(6);
		casa[3][6].setLinha(3);
		
		casa[3][7].setPeca(null);
		casa[3][7].setColuna(7);
		casa[3][7].setLinha(3);
		
		
		casa[4][0].setPeca(null);
		casa[4][0].setColuna(0);
		casa[4][0].setLinha(4);
		
		casa[4][1].setPeca(null);
		casa[4][1].setColuna(1);
		casa[4][1].setLinha(4);
		
		casa[4][2].setPeca(null);
		casa[4][2].setColuna(2);
		casa[4][2].setLinha(4);
		
		casa[4][3].setPeca(null);
		casa[4][3].setColuna(3);
		casa[4][3].setLinha(4);
		
		casa[4][4].setPeca(null);
		casa[4][4].setColuna(4);
		casa[4][4].setLinha(4);
		
		casa[4][5].setPeca(null);
		casa[4][5].setColuna(5);
		casa[4][5].setLinha(4);
		
		casa[4][6].setPeca(null);
		casa[4][6].setColuna(6);
		casa[4][6].setLinha(4);
		
		casa[4][7].setPeca(null);
		casa[4][7].setColuna(7);
		casa[4][7].setLinha(4);
		
		
		casa[5][0].setPeca(pecas.get(11));
		casa[5][0].setColuna(0);
		casa[5][0].setLinha(5);
		
		casa[5][1].setPeca(null);
		casa[5][1].setColuna(1);
		casa[5][1].setLinha(5);
		
		casa[5][2].setPeca(pecas.get(10));
		casa[5][2].setColuna(2);
		casa[5][2].setLinha(5);
		
		casa[5][3].setPeca(null);
		casa[5][3].setColuna(3);
		casa[5][3].setLinha(5);
		
		casa[5][4].setPeca(pecas.get(9));
		casa[5][4].setColuna(4);
		casa[5][4].setLinha(5);
		
		casa[5][5].setPeca(null);
		casa[5][5].setColuna(5);
		casa[5][5].setLinha(5);
		
		casa[5][6].setPeca(pecas.get(8));
		casa[5][6].setColuna(6);
		casa[5][6].setLinha(5);
		
		casa[5][7].setPeca(null);
		casa[5][7].setColuna(7);
		casa[5][7].setLinha(5);
		
		
		casa[6][0].setPeca(null);
		casa[6][0].setColuna(0);
		casa[6][0].setLinha(6);
		
		casa[6][1].setPeca(pecas.get(7));
		casa[6][1].setColuna(1);
		casa[6][1].setLinha(6);
		
		casa[6][2].setPeca(null);
		casa[6][2].setColuna(2);
		casa[6][2].setLinha(6);
		
		casa[6][3].setPeca(pecas.get(6));
		casa[6][3].setColuna(3);
		casa[6][3].setLinha(6);
		
		casa[6][4].setPeca(null);
		casa[6][4].setColuna(4);
		casa[6][4].setLinha(6);
		
		casa[6][5].setPeca(pecas.get(5));
		casa[6][5].setColuna(5);
		casa[6][5].setLinha(6);
		
		casa[6][6].setPeca(null);
		casa[6][6].setColuna(6);
		casa[6][6].setLinha(6);
		
		casa[6][7].setPeca(pecas.get(4));
		casa[6][7].setColuna(7);
		casa[6][7].setLinha(6);
		
		
		casa[7][0].setPeca(pecas.get(3));
		casa[7][0].setColuna(0);
		casa[7][0].setLinha(7);
		
		casa[7][1].setPeca(null);
		casa[7][1].setColuna(1);
		casa[7][1].setLinha(7);
		
		casa[7][2].setPeca(pecas.get(2));
		casa[7][2].setColuna(2);
		casa[7][2].setLinha(7);
		
		casa[7][3].setPeca(null);
		casa[7][3].setColuna(3);
		casa[7][3].setLinha(7);
		
		casa[7][4].setPeca(pecas.get(1));
		casa[7][4].setColuna(4);
		casa[7][4].setLinha(7);
		
		casa[7][5].setPeca(null);
		casa[7][5].setColuna(5);
		casa[7][5].setLinha(7);
		
		casa[7][6].setPeca(pecas.get(0));
		casa[7][6].setColuna(6);
		casa[7][6].setLinha(7);
		
		casa[7][7].setPeca(null);
		casa[7][7].setColuna(7);
		casa[7][7].setLinha(7);

		
		/*casa[0][0].setPeca(null);
		casa[0][1].setPeca(jogador2.getPecas().get(0));
//		jogador2.getPecas().get(0).setCasa(casa[0][1]);
		casa[0][2].setPeca(null);
		casa[0][3].setPeca(jogador2.getPecas().get(1));
		casa[0][4].setPeca(null);
		casa[0][5].setPeca(jogador2.getPecas().get(2));
		casa[0][6].setPeca(null);
		casa[0][7].setPeca(jogador2.getPecas().get(3));
		
		casa[1][0].setPeca(jogador2.getPecas().get(4));
		casa[1][1].setPeca(null);
		casa[1][2].setPeca(jogador2.getPecas().get(5));
		casa[1][3].setPeca(null);
		casa[1][4].setPeca(jogador2.getPecas().get(6));
		casa[1][5].setPeca(null);
		casa[1][6].setPeca(jogador2.getPecas().get(7));
		casa[1][7].setPeca(null);
		
		casa[2][0].setPeca(null);
		casa[2][1].setPeca(jogador2.getPecas().get(8));
		casa[2][2].setPeca(null);
		casa[2][3].setPeca(jogador2.getPecas().get(9));
		casa[2][4].setPeca(null);
		casa[2][5].setPeca(jogador2.getPecas().get(10));
		casa[2][6].setPeca(null);
		casa[2][7].setPeca(jogador2.getPecas().get(11));

		casa[3][0].setPeca(null);
		casa[3][1].setPeca(null);
		casa[3][2].setPeca(null);
		casa[3][3].setPeca(null);
		casa[3][4].setPeca(null);
		casa[3][5].setPeca(null);
		casa[3][6].setPeca(null);
		casa[3][7].setPeca(null);
		
		casa[4][0].setPeca(null);
		casa[4][1].setPeca(null);
		casa[4][2].setPeca(null);
		casa[4][3].setPeca(null);
		casa[4][4].setPeca(null);
		casa[4][5].setPeca(null);
		casa[4][6].setPeca(null);
		casa[4][7].setPeca(null);
		
		casa[5][0].setPeca(jogador1.getPecas().get(11));
		casa[5][1].setPeca(null);
		casa[5][2].setPeca(jogador1.getPecas().get(10));
		casa[5][3].setPeca(null);
		casa[5][4].setPeca(jogador1.getPecas().get(9));
		casa[5][5].setPeca(null);
		casa[5][6].setPeca(jogador1.getPecas().get(8));
		casa[5][7].setPeca(null);
		
		casa[6][0].setPeca(null);
		casa[6][1].setPeca(jogador1.getPecas().get(7));
		casa[6][2].setPeca(null);
		casa[6][3].setPeca(jogador1.getPecas().get(6));
		casa[6][4].setPeca(null);
		casa[6][5].setPeca(jogador1.getPecas().get(5));
		casa[6][6].setPeca(null);
		casa[6][7].setPeca(jogador1.getPecas().get(4));
		
		casa[7][0].setPeca(jogador1.getPecas().get(3));
		casa[7][1].setPeca(null);
		casa[7][2].setPeca(jogador1.getPecas().get(2));
		casa[7][3].setPeca(null);
		casa[7][4].setPeca(jogador1.getPecas().get(1));
		casa[7][5].setPeca(null);
		casa[7][6].setPeca(jogador1.getPecas().get(0));
		casa[7][7].setPeca(null);*/
		
		/*for(int i = 0; i <= 2; i++){
			for(int j = 0; j < 8; j = j+2){
					casa[i][j] = new Casa();
				if(i%2 == 0){
					casa[i][j].setValor(0);
					casa[i][j+1].setValor(-1);
				}
				else{
					casa[i][j].setValor(-1);
					casa[i][j+1].setValor(0);
				}
			}
		}
		
		for(int i = 3; i <= 4; i++){
			for(int j = 0; j < 8; j++){
				casa[i][j] = new Casa();
				casa[i][j].setValor(0);
			}
		}
		
		for(int i = 5; i <= 7; i++){
			for(int j = 0; j < 8; j = j+2){
				casa[i][j] = new Casa();
				if(i%2 == 0){
					casa[i][j].setValor(1);
					casa[i][j+1].setValor(0);
				}
				else{
					casa[i][j].setValor(0);
					casa[i][j+1].setValor(1);
				}
			}
		}*/
	}
	
	public void ApresentarDestinoMovimento(int linhaOrigem, int colunaOrigem, int valor){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				casa[i][j].setPossivelDestino(false);
			}
		}
		if(valor == -1){
			if(colunaOrigem > 0 && linhaOrigem < 7){
				if(casa[linhaOrigem+1][colunaOrigem-1].getValor() == 0){
					casa[linhaOrigem+1][colunaOrigem-1].setPossivelDestino(true);
				}
				else if(casa[linhaOrigem+1][colunaOrigem-1].getValor() == 1){
					if(colunaOrigem > 1 && linhaOrigem < 6){
						if(casa[linhaOrigem+2][colunaOrigem-2].getValor() == 0){//Ativar Ataque
							casa[linhaOrigem+2][colunaOrigem-2].setPossivelDestino(true);
							casa[linhaOrigem+2][colunaOrigem-2].setDestinoAtaque(true);
							linhaAmeacada = linhaOrigem+1;
							colunaAmeacada = colunaOrigem-1;
						}
					}
					
				}
			}
			if(colunaOrigem < 7 && linhaOrigem < 7){
				if(casa[linhaOrigem+1][colunaOrigem+1].getValor() == 0){
					casa[linhaOrigem+1][colunaOrigem+1].setPossivelDestino(true);
				}
				else if(casa[linhaOrigem+1][colunaOrigem+1].getValor() == 1){
					if(colunaOrigem < 6 && linhaOrigem < 6){
						if(casa[linhaOrigem+2][colunaOrigem+2].getValor() == 0){//Ativar Ataque
							casa[linhaOrigem+2][colunaOrigem+2].setPossivelDestino(true);
							casa[linhaOrigem+2][colunaOrigem+2].setDestinoAtaque(true);
							linhaAmeacada = linhaOrigem+1;
							colunaAmeacada = colunaOrigem+1;
						}
					}
					
				}
			}
		}
		else if(valor == 1){
			if(colunaOrigem > 0 && linhaOrigem > 0){
				if(casa[linhaOrigem-1][colunaOrigem-1].getValor() == 0){
					casa[linhaOrigem-1][colunaOrigem-1].setPossivelDestino(true);
				}
				else if(casa[linhaOrigem-1][colunaOrigem-1].getValor() == -1){
					if(colunaOrigem > 1 && linhaOrigem > 1){
						if(casa[linhaOrigem-2][colunaOrigem-2].getValor() == 0){//Ativar Ataque
							casa[linhaOrigem-2][colunaOrigem-2].setPossivelDestino(true);
							casa[linhaOrigem-2][colunaOrigem-2].setDestinoAtaque(true);
							linhaAmeacada = linhaOrigem-1;
							colunaAmeacada = colunaOrigem-1;
						}
					}
					
				}
			}
			if(colunaOrigem < 7 && linhaOrigem > 0){
				if(casa[linhaOrigem-1][colunaOrigem+1].getValor() == 0){
					casa[linhaOrigem-1][colunaOrigem+1].setPossivelDestino(true);
				}
				else if(casa[linhaOrigem-1][colunaOrigem+1].getValor() == -1){
					if(colunaOrigem < 6 && linhaOrigem > 1){
						if(casa[linhaOrigem-2][colunaOrigem+2].getValor() == 0){//Ativar Ataque
							casa[linhaOrigem-2][colunaOrigem+2].setPossivelDestino(true);
							casa[linhaOrigem-2][colunaOrigem+2].setDestinoAtaque(true);
							linhaAmeacada = linhaOrigem-1;
							colunaAmeacada = colunaOrigem+1;
						}
					}
					
				}
			}
		}
	}

	public void MovimentarPara(int linha, int coluna){
		casa[linha][coluna].setValor(casa[linhaOrigem][colunaOrigem].getValor());
		casa[linhaOrigem][colunaOrigem].setValor(0);
	}

	
	
	/*public int getEstadoJogo() {
		return estadoJogo;
	}

	public void setEstadoJogo(int estadoJogo) {
		this.estadoJogo = estadoJogo;
	}
	
	public int getNumPecas1() {
		return numPecas1;
	}
	
	public int getNumPecas2() {
		return numPecas2;
	}
	
	public void setNumPecas1(int numPecas){
		this.numPecas1 = numPecas;
	}
	
	public void setNumPecas2(int numPecas){
		this.numPecas2 = numPecas;
	}
	
	public int GameOver(){
		if(numPecas1 == 0)
			return -1;
		else if(numPecas2 == 0)
			return 1;
		else{
			return 0;
		}
		//return false;
		
	}
	*/

}
