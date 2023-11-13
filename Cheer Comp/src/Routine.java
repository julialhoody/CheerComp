
public class Routine
	{
		public int tumbling; 
		public int stunts; 
		public int cheer;
		public int dance;
		
		public Routine(int t, int s, int c, int d)
		{
			tumbling = t; 
			stunts = s; 
			cheer = c; 
			dance = d;
		}
		public int getTumbling()
		{
			return tumbling;
		}
		public void setTumbling (int tumbling)
		{
			this.tumbling = tumbling;
		}
		public int getStunts()
		{
			return stunts;
		}
		public void getStunts (int stunts)
		{
			this.stunts = stunts;
		}
		public int getCheer()
		{
			return cheer;
		}
		public void setCheer (int cheer)
		{
			this.cheer = cheer;
		}
		public int getDance()
		{
			return dance;
		}
		public void getDance (int dance)
		{
			this.dance = dance;
		}

	}
