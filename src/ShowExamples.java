import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Arrays;

/**
 * @author Maria Liu
 * @author Kevin Dang
 */

public class ShowExamples 
{
	ShowManager1 sm1 = new ShowManager1();
	LinkedList<Show> shows = new LinkedList<Show>();
	LinkedList<Show> showsOne = new LinkedList<>();
	LinkedList<Show> showsTwo = new LinkedList<>();
	LinkedList<Show> showsThree = new LinkedList<>();
	LinkedList<Show> showsFour = new LinkedList<>();
	LinkedList<Show> showsFive = new LinkedList<>();
	LinkedList<Show> showsSix = new LinkedList<>();
	LinkedList<Show> emptyShows = new LinkedList<Show>();
	ShowSummary report1 = new ShowSummary();
	ShowSummary report2 = new ShowSummary();
	ShowSummary report3 = new ShowSummary();
	
	public ShowExamples()
	{
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));		
		Show s1 = new Show("Star Trek", 1800, eps1, false);
		showsOne.add(s1);
		shows.add(s1);
		showsTwo.add(s1);
		showsThree.add(s1);
		showsFour.add(s1);
		showsFive.add(s1);
		report1.primetime.add(s1);
		report2.primetime.add(s1);
		
		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		Show s2 = new Show("Futurama", 1900, eps2, false);
		shows.add(s2);
		showsOne.add(s2);
		showsTwo.add(s2);
		showsThree.add(s2);
		showsFour.add(s2);
		showsFive.add(s2);
		report1.primetime.add(s2);
		report2.primetime.add(s2);
		
		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		Show s3 = new Show("Animaniacs", 1630, eps3, false);
		shows.add(s3);
		showsOne.add(s3);
		showsTwo.add(s3);
		showsThree.add(s3);
		showsFour.add(s3);
		showsFive.add(s3);
		report1.daytime.add(s3);
		report2.daytime.add(s3);
		
		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		Show s4 = new Show("Sesame Street", 900, eps4, false);
		shows.add(s4);
		showsOne.add(s4);
		showsTwo.add(s4);
		showsThree.add(s4);
		showsFour.add(s4);
		showsFive.add(s4);
		report1.daytime.add(s4);
		report2.daytime.add(s4);


		LinkedList<Episode> eps5 = new LinkedList<>();
		eps5.add(new Episode("Unfinished Business", 22));
		eps5.add(new Episode("Gang Gang", 23));
		eps5.add(new Episode("Story of Gangstalicious", 21));
		Show s5 = new Show("One Dollar", 101, eps5, false);
		showsOne.add(s5);
		showsTwo.add(s5);
		showsThree.add(s5);
		showsFour.add(s5);
		showsFive.add(s5);

		LinkedList<Episode> eps6 = new LinkedList<>();
		eps6.add(new Episode("Riley Was Here", 23));
		eps6.add(new Episode("Let's Nab Operah",50));
		eps6.add(new Episode("The Color Ruckus", 33));
		Show s6 = new Show("Two Dollars", 100, eps6, false);
		showsTwo.add(s6);
		showsThree.add(s6);
		showsFour.add(s6);
		showsFive.add(s6);

		LinkedList<Episode> eps7 = new LinkedList<>();
		eps7.add(new Episode("Calculator Napper", 25));
		eps7.add(new Episode("Papercut", 22));
		eps7.add(new Episode("Puppy Dog T", 10));
		Show s7 = new Show("Skewl", 500, eps7, false);
		showsThree.add(s7);
		showsFour.add(s7);
		showsFive.add(s7);

		LinkedList<Episode> eps8 = new LinkedList<>();
		eps8.add(new Episode("High on Potenuse", 21));
		eps8.add(new Episode("Breaking Ice Breakers", 20));
		eps8.add(new Episode("Insight Group", 23));
		Show s8 = new Show("Brooklyn Boys", 630, eps8, true);
		showsFour.add(s8);
		showsFive.add(s8);
		showsSix.add(s8);

		LinkedList<Episode> eps9 = new LinkedList<>();
		eps8.add(new Episode("AK", 21));
		eps8.add(new Episode("FL", 20));
		eps8.add(new Episode("GH", 23));
		Show s9 = new Show("Camp On Us", 130, eps9, true);
		showsFive.add(s9);
		showsSix.add(s9);

		LinkedList<Episode> eps10 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter I", 59));
		eps4.add(new Episode("The Letter W", 57));
		eps4.add(new Episode("The Letter P", 58));
		Show s10 = new Show("Donkey Kong", 900, eps4, false);
		showsOne.add(s10);
		report2.daytime.add(s10);



	}
	
	@Test
	public void instructorTestOrganizeShows() {
		ShowSummary report2 = sm1.organizeShows(shows);
		assertEquals(report1, report2);
	}

	@Test
	public void testOrganizeShows() {
		ShowSummary report2 = sm1.organizeShows(emptyShows);
		assertEquals(new ShowSummary(new LinkedList<Show>(), new LinkedList<Show>(), new LinkedList<Show>()), report2);
	}

	@Test
	public void testOrganizeShowsOne() {
		ShowSummary report3 = sm1.organizeShows(showsOne);
		assertEquals(report2, report3);
	}

	@Test
	public void testOrganizeShowsTwo(){
		ShowSummary report4 = sm1.organizeShows(showsTwo);
		assertEquals(report1, report4);
	}

	@Test
	public void testOrganizeShowsThree(){
		ShowSummary report5 = sm1.organizeShows(showsThree);
		assertEquals(report1, report5);
	}

	@Test
	public void testOrganizeShowsFour(){
		ShowSummary report6 = sm1.organizeShows(showsFour);
		assertEquals(report1, report6);
	}

	@Test
	public void testOrganizeShowsFive(){
		ShowSummary report7 = sm1.organizeShows(showsFive);
		assertEquals(report1, report7);
	}

	@Test
	public void testOrganizeShowsSix(){
		ShowSummary report8 = sm1.organizeShows(showsSix);
		assertEquals(report3, report8);
	}






	/*
	Subtasks for Problem 1
	- create 3 lists of shows: one for daytime, primetime, and overnight
	- create a ShowSummary object containing each list
	- loop through each show in the give list
	- if the show is not a special
		- if it starts at or after 6am and before 5pm
			- add it to list of daytime shows
		- if it starts at or after 5pm and before 10pm
			- add it to list of primetime shows
		- if it starts at or after 10pm and before 1am
			- add it to the list of late night shows
	- return the ShowSummary object
	 */
}
