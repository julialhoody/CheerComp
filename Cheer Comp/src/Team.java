
public class Team
	{
		private String name;
		private int score;
		private int size;
		private Routine comp;
		
		public Team(String n, int sc, int s)
		{
			name = n; 
			score = sc; 
			size = s;
			comp = new Routine(0, 0, 0, 0);
			//each team has a routine object as a part of the routine
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
		public Routine getComp()
		{
			return comp;
			//gives access to the routine object
		}
	}
