package com.br.game.app.player;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	private int x;
	private int y;
	private int dx;
	private int dy;
	private int pos;
	private Image imagem;
	private boolean isVisivel;
	private static final int LARGURA = 52;
	private static final int ALTURA = 52;
	
	public Player() {
		ImageIcon referencia = new ImageIcon("res/player/nave.png");
		imagem =  referencia.getImage();
		pos = 0;
		x = 155;
		y = 330;
		isVisivel = true;
	}
	
	public void mover() {
		x += dx;
		y += dy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public Image getImagem() {
		return imagem;
	}

	public void setImagem(Image imagem) {
		this.imagem = imagem;
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}
	
	public int getAlt() {
		return ALTURA;
	}

	public int getLar() {
		return LARGURA;
	}
	
}
