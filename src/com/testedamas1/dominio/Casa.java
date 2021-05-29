package com.testedamas1.dominio;

public class Casa {
	private Peca peca;
	private int valor;
	private int linha;
	private int coluna;
	
	private boolean origemMovimento;
	private boolean possivelDestino;
	private boolean destinoEscolhido;
	private boolean destinoAtaque;
	private boolean pecaAmeacada;
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public boolean isOrigemMovimento() {
		return origemMovimento;
	}
	public void setOrigemMovimento(boolean origemMovimento) {
		this.origemMovimento = origemMovimento;
	}
	
	public boolean isPossivelDestino() {
		return possivelDestino;
	}
	public void setPossivelDestino(boolean possivelDestino) {
		this.possivelDestino = possivelDestino;
	}
	
	public boolean isDestinoEscolhido() {
		return destinoEscolhido;
	}
	public void setDestinoEscolhido(boolean destinoEscolhido) {
		this.destinoEscolhido = destinoEscolhido;
	}
	public boolean isDestinoAtaque() {
		return destinoAtaque;
	}
	public void setDestinoAtaque(boolean destinoAtaque) {
		this.destinoAtaque = destinoAtaque;
	}
	public Peca getPeca() {
		return peca;
	}
	public void setPeca(Peca peca) {
		this.peca = peca;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
}
