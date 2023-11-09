
public class Team
	{
		private String name;
		private int score;
		private int size;
		
		public Team(String n, int sc, int s)
		{
			name = n; 
			score = sc; 
			size = s; 
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
		public int getSize()
		{
			return size;
		}
		public void setSize(int size)
		{
			this.size = size;
		}
		

	}
