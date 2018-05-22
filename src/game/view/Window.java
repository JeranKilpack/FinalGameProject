package game.view;

import javax.swing.JFrame;
import game.controller.Game;

public class Window 
{
	public static void main(String args[]) 
	{
		JFrame f = new JFrame();
		Game s = new Game();
		f.add(s);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 600);
	}
}
