import java.util.ArrayList;

public class Database
	{
 
		static ArrayList<Team> teams = new ArrayList<Team>();
		public static void fillArray()
		{
			teams.add(new Team("Mullen",0, 14));
			teams.add(new Team("Erie",0, 21));
			teams.add(new Team("Douglas County", 0, 15));
			teams.add(new Team("Regis",0, 16));
			teams.add(new Team("East", 0, 17));
			teams.add(new Team("South", 0, 20));
			teams.add(new Team("Sheridan", 0, 11));
			teams.add(new Team("Bear Creek", 0, 14));
			teams.add(new Team("Littleton", 0, 19));
			teams.add(new Team("Lakewood", 0, 21));
			teams.add(new Team("Green Mountain", 0, 23));
			teams.add(new Team("Arapahoe", 0, 25));
			teams.add(new Team("Heritage", 0, 26));
			teams.add(new Team("Cherry Creek", 0, 30));
			teams.add(new Team("Legend", 0, 11));
			teams.add(new Team("Grand View", 0, 12));
			
		}
	}
