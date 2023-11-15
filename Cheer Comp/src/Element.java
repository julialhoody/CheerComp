//array list with routine elements based off of level of difficulty (1- 5: 1 being the easiest and 5 being the hardest)(Dance and cheer 1 being the best and 5 being the worst)
import java.util.ArrayList;

public class Element
	{
      static ArrayList<Routine>tumbling = new ArrayList<Routine>();
      public static void fillArray()
      {
    	  tumbling.add(new Routine(1, 3, 2, 4));
    	  tumbling.add(new Routine(3, 1, 5, 4));
    	  tumbling.add(new Routine(5, 3, 3, 5));
    	  tumbling.add(new Routine(4, 2, 4, 3));
    	  tumbling.add(new Routine(1, 5, 3, 5));
    	  tumbling.add(new Routine(2, 4, 2, 1));
    	  tumbling.add(new Routine(3, 2, 4, 2));
    	  tumbling.add(new Routine(5, 5, 1, 5));
    	  tumbling.add(new Routine(2, 3, 5, 2));
    	  tumbling.add(new Routine(3, 4, 2, 3));
    	  tumbling.add(new Routine(4, 1, 1, 4));
    	  tumbling.add(new Routine(1, 2, 3, 5));
    	  tumbling.add(new Routine(2, 4, 3, 3));
    	  tumbling.add(new Routine(4, 3, 4, 4));
    	  tumbling.add(new Routine(3, 1, 5, 5));
    	  tumbling.add(new Routine(2, 2, 1, 3));  
      }
	}
