import java.util.LinkedList;

/**
 * Contains a method that organizes shows
 */
class ShowManager2 {
	
	ShowManager2() {}

	/**
	 * produces a report containing all of the daytime, primetime, and late night shows in the list that
	 * are not special
	 * @param shows
	 * @return ShowSummary containing non-special daytime, primetime, and late night shows
	 */
	public ShowSummary organizeShows(LinkedList<Show> shows){
		ShowSummary report = new ShowSummary();
		for(Show show : shows){
			if(!show.isSpecial && show.broadcastTime >= 600 && show.broadcastTime < 1700){
				report.daytime.add(show);
			}
		}
		for(Show show : shows){
			if(!show.isSpecial && show.broadcastTime >= 1700 && show.broadcastTime < 2200){
				report.primetime.add(show);
			}
		}
		for (Show show : shows){
			if(!show.isSpecial && show.broadcastTime >= 2200 || show.broadcastTime < 100){
				report.latenight.add(show);
			}
		}
		return report;
	}
	
}
