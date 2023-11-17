import java.util.Scanner;
import java.util.ArrayList;

public class Score
	{
		
		public static void main(String args[])
		{
			Database.fillArray(); 
			
			System.out.println("Welcome to the Cheer Competition! \nWhat team are you on?");
			Scanner userInput = new Scanner(System.in);
			String userTeamName = userInput.nextLine();
			boolean foundTeam = false;
			Team userTeam = null;
			//team being checked
		
			for(Team t: Database.teams)
			{
				if(t.getName().equals(userTeamName))
				{
					foundTeam = true;
					System.out.println("Team " + userTeamName + " is at this competition!");
					//found team in arraylist 
					userTeam = t;
				}
			}
			if(foundTeam == false)
			{
				System.out.println("You are not registered for this competiton!");
			}
			else 
			{
				randomizeScores();
				 
				System.out.println("\nEach part of your routine will be out of 25!");
				
				System.out.println("What is the tumbling score for " + userTeamName + "?"); 
				int score = userInput.nextInt();
				userTeam.getComp().setTumbling(score);
				//set the input to what they want the score to be 
				
				System.out.println("What is the stunts score for " + userTeamName + "?"); 
				score = userInput.nextInt();
				userTeam.getComp().setStunts(score);
				
				System.out.println("What is the cheer score for " + userTeamName + "?"); 
				score = userInput.nextInt();
				userTeam.getComp().setCheer(score);
				
				System.out.println("What is the dance score for " + userTeamName +  "? "); 
				score = userInput.nextInt();
				userTeam.getComp().setDance(score);
				
				System.out.println("\n");
				
				
				for(Team t: Database.teams)
				{
					//setting score to the competition total score 
					t.setScore( t.getComp().totalScore());
					System.out.println("The final score of " + t.getName() + " is " + t.getScore() + "!");
				}
			}
		}
		
		public static void randomizeScores()
		{
			//takes every team in the array list and randomizes the scores 
			for( Team t: Database.teams)
			{
				t.getComp().setTumbling( (int) (Math.random() * 25) + 1);
				t.getComp().setStunts( (int) (Math.random() * 25) + 1);
				t.getComp().setCheer( (int) (Math.random() * 25) + 1);
				t.getComp().setDance( (int) (Math.random() * 25) + 1);
			}
		}
		

	}
