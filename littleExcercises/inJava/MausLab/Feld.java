package inJava.MausLab;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Feld extends JFrame
{
		
	
		int [] [] Feld =  {
											{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
											{1,3,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1},
											{1,0,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,0,1},
											{1,0,1,0,0,1,0,0,0,0,1,9,0,0,1,0,0,0,1},
											{1,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1},
											{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
											{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
											};
									
		
		private final ArrayList<Integer> path = new ArrayList<Integer>();
		private int pathIndex;
		
					public Feld()
					{
					setTitle("Maus im Labirinth");
					setSize(630,260);
					setLocationRelativeTo(null);
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
					SuchAlgo.searchPath(Feld,1,1,path);
					pathIndex = path.size() -2;
					System.out.println(path);
					}
	@Override
	public void paint(Graphics g) {
	// TODO Auto-generated method stub
	super.paint(g);
	g.translate(30,30);
	
	for(int row = 0 ; row < Feld.length;row++)
	{
		for(int col = 0 ; col <Feld[0].length;col++)
		{
			Color color;
			switch(Feld[row][col])
			{
			case 1 : color = Color.BLACK; break;
			case 9 : color = Color.YELLOW;break;
			case 3 : color = Color.GRAY; break;
			default : color = Color.WHITE;break;
			}
			g.setColor(color);
			g.fillRect(30 * col, 30 * row, 30, 30);
			g.setColor(Color.BLACK);
			g.drawRect(30 * col, 30 * row, 30, 30);
		}
	}
	for(int p = 0 ; p<path.size(); p +=2)
	{
		int pathX = path.get(p);
		int pathY = path.get(p+1);
		g.setColor(Color.RED);
		g.fillRect(pathX * 30, pathY  * 30, 30, 30);
		}
	int pathX = path.get(pathIndex);
	int pathY = path.get(pathIndex +1 );
	g.setColor(Color.YELLOW);
	g.fillOval(pathX*30, pathY*30, 30, 30);
	}
	
	
	
	@Override
	protected void processKeyEvent(KeyEvent ke)
	{
		if(ke.getID() != KeyEvent.KEY_PRESSED)
		{
			return;
		}
		if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			pathIndex -= 2;
			if(pathIndex < 0)
			{
				pathIndex = 0;
			}
		}
		else if(ke.getKeyCode() == KeyEvent.VK_LEFT)
		{
			pathIndex += 2;
			if(pathIndex > path.size() - 2)
			{
				pathIndex = path.size() -2;
			}
		}
		repaint();
	}
	public static void main(String[]args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
			Feld feld = new Feld();
			feld.setVisible(true);
			}
		});
	}
											
	}
	