
public class Team
	{
		private String name;
		private int score;
		private int bulk;
		
		public Team(String n, int s, int b)
		{
			name = n; 
			score = s; 
			bulk = b; 
		}
		
		public String getName()
		{
			return name;
		}
		public void setName (String name)
		{
			this.name = name;
		}
		public int getScore()
		{
			return score;
		}
		public void setScore (int score)
		{
			this.score = score;
			
		}
		public int getBulk()
		{
			return bulk;
		}
		public void setBulk(int bulk)
		{
			this.bulk = bulk;
		}
		

	}
