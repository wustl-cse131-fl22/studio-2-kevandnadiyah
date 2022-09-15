package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Starting Amount: ");
		int startAmount = in.nextInt();
		
		System.out.println("Win Chance (percentage with no sign): ");
		double winChance = in.nextDouble();
		
		System.out.println("Win Limit: ");
		double winLimit = in.nextDouble();
		
		System.out.println("Total Simulations: ");
		int totalSimulations = in.nextInt();
		
		int totalSimulations2 = (1);
		
		int numberPlays =(0);
		
		int numberWins = (0);
		int numberLoss = (0);
		
		int currentMoney = startAmount;
		
		for (int i = 0; i < totalSimulations; i++)
		{
		while (currentMoney > 0 && currentMoney < winLimit)
		{
			double rnd = Math.random();
			if (rnd <= (winChance/100))
			{
				currentMoney++;
				numberPlays++;
				numberWins++;
			}
			if (rnd > (winChance/100))
			{
				currentMoney--;
			numberPlays++;
			numberLoss++;
			}
			
		}
		if (currentMoney == 0)
		{
			System.out.println("Ruin");
			System.out.println("Day: "+totalSimulations2++);
			System.out.println("Number of Plays: "+numberPlays++);
			System.out.println("Number of Wins: "+numberWins++);
			System.out.println("Number of Losses: "+numberLoss++);
		}
		if (currentMoney == winLimit)
		{
			System.out.println("Success");
			System.out.println("Total Simulations: "+totalSimulations2++);
			System.out.println("Number of Plays: "+numberPlays++);
			System.out.println("Number of Wins: "+numberWins++);
			System.out.println("Number of Losses: "+numberLoss++);
		}
		
	}
	}
	
}
