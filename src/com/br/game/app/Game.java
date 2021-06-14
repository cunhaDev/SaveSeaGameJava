package com.br.game.app;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.br.game.app.player.Player;

public class Game extends JFrame {

	private Timer timer;
	private Image fundo;
	private Fase fase;
	private Player player;
	private Graphics2D grafico;

	public static void main(String[] args) {
		new Game();
	}

	protected Game() {
		Componentes();
		initializar();
	}

	public void Componentes() {
		setTitle("Save Sea");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 455);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public void initializar() {
		fase = new Fase();
		add(fase);
		ImageIcon referencia = new ImageIcon("res/fundoFase/background.jpg");
		fundo = referencia.getImage();
		player = new Player();
		timer = new Timer(5, new Listener());
		timer.start();
	}

	private class Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			fase.repaint();
		}
	}

	public class Fase extends JPanel {
		protected static final int ALTURA = 400;
		protected static final int LARGURA = 455;

		protected Fase() {
			setDoubleBuffered(true);
		}

		public void paint(Graphics g) {
			grafico = (Graphics2D) g;
			grafico.drawImage(fundo, 0, 0, null);
			
			grafico.drawImage(player.getImagem(),
					player.getX(), player.getY(),
					player.getX() + player.getLar(),
					player.getY() + player.getAlt(),
					1 + (player.getPos() * player.getLar()), 1,
					1 + (player.getPos() * player.getLar()) + player.getLar(),
					player.getAlt() + 1, null);
			
			g.dispose();
		}

		public int getLar() {
			return LARGURA;
		}

		public int getAlt() {
			return ALTURA;
		}
	}
}
