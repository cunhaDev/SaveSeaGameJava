package com.br.game.app;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame {
	
	private ImageIcon iconBackground = new ImageIcon(getClass().getResource("background.jpg"));
	private ImageIcon iconPlayerParado = new ImageIcon(getClass().getResource("playerParado.gif"));
	private ImageIcon iconPlayerMovendo = new ImageIcon(getClass().getResource("playerMovendo.gif"));
	
	private int posPlayerX = 140;
	private int posPlayerY = 200;
	
	JLabel LBackground = new JLabel(iconBackground);
	JLabel LPlayer = new JLabel(iconPlayerParado);
	
	public Game() {
		editWindow();
		editComponents();
		moveplayer();
	}
	
	public void moveplayer() {
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				//Method is not necessary
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				LPlayer.setIcon(iconPlayerParado);
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				LPlayer.setIcon(iconPlayerMovendo);
				if(e.getKeyCode() == 38) {
					posPlayerY -= 10;
				}
				
				if(e.getKeyCode() == 40) {
					posPlayerY += 10;
				}
				
				if(e.getKeyCode() == 37) {
					posPlayerX -= 10;
				}
				
				if(e.getKeyCode() == 39) {
					posPlayerX += 10;
				}
				LPlayer.setBounds(posPlayerX, posPlayerX, 200, 200);
			}
		});
	}
	
	public void editComponents() {
		LBackground.setBounds(0, 0, 400, 400);
		LPlayer.setBounds(posPlayerX, posPlayerY, 200, 200);
	}
	
	public void editWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,439);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		add(LPlayer);
		add(LBackground);
	}
	
	public static void main(String[] args) {
		new Game();
	}

}

