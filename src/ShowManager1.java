import java.util.LinkedList;

/**
 * Contains a method that organizes shows
 */
class ShowManager1 {
	
	ShowManager1() {}

	/**
	 * produces a report containing all of the daytime, primetime, and late night shows in the list that
	 * are not special
	 * @param shows
	 * @return ShowSummary containing non-special daytime, primetime, and late night shows
	 */
	public ShowSummary organizeShows(LinkedList<Show> shows) {
		LinkedList<Show> daytime = new LinkedList<Show>();
		LinkedList<Show> primetime = new LinkedList<Show>();
		LinkedList<Show> latenight = new LinkedList<Show>();
		ShowSummary report = new ShowSummary(daytime, primetime, latenight);

		for (Show s: shows) {
			if (!s.isSpecial) {
				if (s.broadcastTime >= 600 && s.broadcastTime < 1700)
					daytime.add(s);
				else if (s.broadcastTime >= 1700 && s.broadcastTime < 2200)
					primetime.add(s);
				else if (s.broadcastTime >= 2200 || s.broadcastTime < 100)
					latenight.add(s);
			}
		}
		return report;
	}
}
