/**
*
* <description project>
* @author
* @version
*/

import java.util.Scanner;


public class FarmersGame
{
	// global scope
	// assuming false is bank 0 and true is bank 1
	public static boolean cabb;
	public static boolean sheep;
	public static boolean wolf;
	public static boolean human;
	
	
	
	public static void main(String[] args)
	{
		
		
		welcome();	
		displayGameStatus();
		while (checkGame() == 1)
		{	

			move();
			displayGameStatus();
		}
	}
	
	
	/**
	*
	*
	*/
	public static void welcome()
	{
	
		System.out.println("Farmer's Game");
		
	}
	
	
	/**
	*
	*
	*/
	public static void displayGameStatus()
	{
		String bank0 = "    ";
		String bank1 = "    ";
		
		if(!cabb)
			bank0 += "C   ";
		else
			bank1 += "C   ";
			
		if(!sheep)
			bank0 += "S   ";
		else
			bank1 += "S   ";
			
		if(!wolf)
			bank0 += "W   ";
		else
			bank1 += "W   ";
			
		if(!human)
			bank0 += "H   ";
		else
			bank1 += "H   ";	
			
		System.out.println(bank0);
		System.out.println("--------------------");
		System.out.println("\n\n\n");
		System.out.println("--------------------");
		System.out.println(bank1);
		
	
	}
	
	
	
	/**
	*
	*
	*/
	public static int checkGame()
	{
		if (cabb == sheep && !(human == cabb))
		{
			System.out.println("You lose");	
			return 0;
		} 
		
		else if (wolf == sheep && !(human == wolf))
		{
			System.out.println("You lose");
			return 0;	
		} 
		
		else
			return 1;
			
	}
	
	
	public static void move()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Who would you like to move across. Enter just the first letter: ");
		String input = kb.nextLine();
		
		if (input.equals("C")|| input.equals("c")) 
		{
			if (human == cabb) //makes sure that human and cabbage are on the same side
			{
				cabb = !cabb;
				human = !human;
			}
			
			else
			{
				System.out.println("Move not possible");
			}
			
		}		
		
		
		if (input.equals("S")|| input.equals("s")) 
		{
			if (human == sheep) //makes sure that human and sheep are on the same side
			{
				sheep = !sheep;
				human = !human;
			}
			
			else
			{
				System.out.println("Move not possible");
			}
			
		}
		
		
		if (input.equals("W")|| input.equals("w")) 
		{
			if (human == wolf) //makes sure that human and cabbage are on the same side
			{
				wolf = !wolf;
				human = !human;
			}
			
			else
			{
				System.out.println("Move not possible");
			}
			
		}
		
		
		
		if (input.equals("H")|| input.equals("h"))
		{
			human = !human;
			
		}		
			
	}
	
	
}