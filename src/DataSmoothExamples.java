import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class DataSmoothExamples
{
	LinkedList<Show> shows = new LinkedList<Show>();
	LinkedList<Show> shows1 = new LinkedList<Show>();
	LinkedList<Show> shows2 = new LinkedList<Show>();
	LinkedList<Show> shows3 = new LinkedList<Show>();
	LinkedList<Show> shows4 = new LinkedList<Show>();

	LinkedList<Double> showResults = new LinkedList<Double>();
	LinkedList<Double> showResults1 = new LinkedList<Double>();
	LinkedList<Double> showResults2 = new LinkedList<Double>();
	LinkedList<Double> showResults3 = new LinkedList<Double>();
	LinkedList<Double> showResults4 = new LinkedList<Double>();

	DataSmooth1 D1 = new DataSmooth1();


	public DataSmoothExamples() {
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));
		shows.add(new Show("Star Trek", 1800, eps1, false));
		shows1.add(new Show("Friends", 1800, eps1, false));
		shows2.add(new Show("Black Mirror", 0, eps1, false));
		shows3.add(new Show("House", 1900, eps1, false));

		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		shows.add(new Show("Futurama", 1900, eps2, false));
		shows1.add(new Show("Friends", 1800, eps2, false));
		shows2.add(new Show("Black Mirror", 0, eps2, false));

		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		shows.add(new Show("Animaniacs", 1630, eps3, false));
		shows1.add(new Show("Friends", 1800, eps3, false));

		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		shows.add(new Show("Sesame Street", 900, eps4, false));

		showResults.add(60.0);		//60
		showResults.add(29.75);		//22.25
		showResults.add(29.08333);	//7
		showResults.add(58.0);
		showResults1.add(60.0);
		showResults1.add(29.75);
		showResults1.add(7.0);
		showResults2.add(60.0);
		showResults2.add(22.25);
		showResults3.add(60.0);

		showResults4.add(null);
	}

	@Test
	public void instructorTestDS() {
		LinkedList<Double> runtimes = D1.dataSmooth(shows);
		for(int i = 0; i < runtimes.size(); i++)
			assertEquals(runtimes.get(i), showResults.get(i), .01);
	}
	@Test
	public void testDS1() {
		LinkedList<Double> runtimes = D1.dataSmooth(shows1);
		for (int i = 0; i < runtimes.size(); i++)
			assertEquals(runtimes.get(i), showResults1.get(i), .01);
	}
	@Test
	public void testDS2() {
		LinkedList<Double> runtimes = D1.dataSmooth(shows2);
		for (int i = 0; i < runtimes.size(); i++)
			assertEquals(runtimes.get(i), showResults2.get(i), .01);
	}
	@Test
	public void testDS3() {
		LinkedList<Double> runtimes = D1.dataSmooth(shows3);
		for (int i = 0; i < runtimes.size(); i++)
			assertEquals(runtimes.get(i), showResults3.get(i), .01);
	}

	@Test
	public void testDS9() {
		LinkedList<Double> runtimes = D1.dataSmooth(shows4);
		assertEquals(runtimes, shows4);
	}
}
  /*
  Subtasks for Problem 2:
  - create a new list of average runtimes for each show
  		- calculate the average runtime for each show by summing the runtimes of all episodes of that
  		  show and dividing by the number of episodes
  - loop through each element in the list of runtimes, starting at the second element and ending with the
  	second to last element
  - for every element in between
  		- change its value to the average of that element and its predecessor and successor
  - return the new list
   */
