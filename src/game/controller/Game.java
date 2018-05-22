package game.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
	public class Game extends JPanel implements ActionListener, KeyListener
	{
		Timer t = new Timer(5, this);
		double player1x = 0, player1y = 0, player1velx = 0, player1vely = 0;
		double player2x = 100, player2y = 100, player2velx = 0, player2vely = 0;
		
		public Game() 
		{
			t.start();
			addKeyListener(this);
			setFocusable(true);
			setFocusTraversalKeysEnabled(false);
		}
		
		public void paintComponent(Graphics g) 
		{
			super.paintComponents(g);
			Graphics2D player1 = (Graphics2D) g;
			Graphics2D player2 = (Graphics2D) g;
			player1.fill(new Ellipse2D.Double(player1x,  player1y,  40, 40));
			player2.fill(new Ellipse2D.Double(player2x,  player2y,  40, 40));
		}
		
		public void up(int player)
		{
			if(player == 1) 
			{
				player1vely = -1.5;
			}
			if(player == 2)
			{
				player2vely = -1.5;
			}
		}
		public void down(int player)
		{
			if(player == 1) 
			{
				player1vely = +1.5;
			}
			if(player == 2)
			{
				player2vely = +1.5;
			}	
		}
		public void left(int player)
		{
			if(player == 1) 
			{
				player1velx = -1.5;
			}
			if(player == 2)
			{
				player2velx = -1.5;
			}	
		}
		public void right(int player)
		{
			if(player == 1) 
			{
				player1velx = +1.5;
			}
			if(player == 2)
			{
				player2velx = +1.5;
			}	
		}
		
		public void stopY(int player)
		{
			if(player == 1) 
			{
				player1vely = 0;
			}
			if(player == 2)
			{
				player2vely = 0;
			}
		}
		
		public void stopX(int player)
		{
			if(player == 1) 
			{
				player1velx = 0;
			}
			if(player == 2)
			{
				player2velx = 0;
			}
		}
		
		public void keyPressed(KeyEvent e) 
		{
			int code = e.getKeyCode();
			if (code == KeyEvent.VK_W)
			{
				up(1);
			}
			if (code == KeyEvent.VK_S)
			{
				down(1);
			}
			if (code == KeyEvent.VK_A)
			{
				left(1);
			}
			if (code == KeyEvent.VK_D)
			{
				right(1);
			}
			if (code == KeyEvent.VK_UP)
			{
				up(2);
			}
			if (code == KeyEvent.VK_DOWN)
			{
				down(2);
			}
			if (code == KeyEvent.VK_LEFT)
			{
				left(2);
			}
			if (code == KeyEvent.VK_RIGHT)
			{
				right(2);
			}
		}
		
		public void keyReleased(KeyEvent e)
		{
			int code = e.getKeyCode();
			if (code == KeyEvent.VK_W)
			{
				stopY(1);
			}
			if (code == KeyEvent.VK_S)
			{
				stopY(1);
			}
			if (code == KeyEvent.VK_A)
			{
				stopX(1);
			}
			if (code == KeyEvent.VK_D)
			{
				stopX(1);
			}
			
			
			if (code == KeyEvent.VK_UP)
			{
				stopY(2);
			}
			if (code == KeyEvent.VK_DOWN)
			{
				stopY(2);
			}
			if (code == KeyEvent.VK_LEFT)
			{
				stopX(2);
			}
			if (code == KeyEvent.VK_RIGHT)
			{
				stopX(2);
			}
		}
		
		public void keyTyped(KeyEvent e)
		{
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("p1 x = " + player1x);
			player1x += player1velx;
			player1y += player1vely;
			player2x += player2velx;
			player2y += player2vely;
			repaint();
		}
		
		

		
	}

