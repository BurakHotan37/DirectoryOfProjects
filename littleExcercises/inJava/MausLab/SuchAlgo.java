package inJava.MausLab;

import java.util.ArrayList;
//import java.util.LinkedList;

public class SuchAlgo 
{
	public static boolean searchPath(int [] [] Feld , int x, int y, ArrayList<Integer> path)
	{
		if(Feld[y][x] == 9)
		{
			path.add(x);

			path.add(y);
			
			return true;
			
		}
		
		if(Feld [y][x] == 0)
		{
			Feld [y][x] = 2;
			
			int dx = -1;
			int dy = 0;
			if(searchPath(Feld, x + dx , y + dy,path))
			{
				path.add(x);
				path.add(y);
				return true;
				
			}
			
			 dx = 1;
			 dy = 0;
			if(searchPath(Feld, x + dx , y + dy,path))
			{
				path.add(x);
				path.add(y);
				return true;
				
			}
			 dx = 0;
			 dy = -1;
			if(searchPath(Feld, x + dx , y + dy,path))
			{
				path.add(x);
				path.add(y);
				return true;
				
			}
			
			 dx = 0;
			 dy = 1;
			if(searchPath(Feld, x + dx , y + dy,path))
			{
				path.add(x);
				path.add(y);
				return true;
				
			}
		}
		return false;
	}

}
