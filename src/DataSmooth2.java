import java.util.LinkedList;

/**
 * Contains a method that smooths a set of run-times for shows
 */
class DataSmooth2 {
    DataSmooth2() { }

    /**
     * calculates the average runtime for each show
     * @param shows
     * @return list of the smoothed runTime values
     */
    public LinkedList<Double> dataSmooth(LinkedList<Show> shows) {
        LinkedList<Double> averageRunTimes = new LinkedList<Double>();
        LinkedList<Double> averageEpRunTime = avgEpRunTime(shows);
        if (shows != null) {
            for (int i = 1; i < averageEpRunTime.size() - 1; i++) {
                if ((i - 1) == 0) averageRunTimes.add(averageEpRunTime.getFirst());
                double average = (averageEpRunTime.get(i - 1) + averageEpRunTime.get(i) + averageEpRunTime.get(i + 1)) / 3;
                averageRunTimes.add(average);
                if ((i + 1) == averageEpRunTime.size() - 1) averageRunTimes.add(averageEpRunTime.getLast());
            }
            return averageRunTimes;
        }
        return averageRunTimes;
    }

    /**
     *
     * @param shows
     * @return the linked list of average episode run times as it parses through the linked list of shows
     */

    public LinkedList<Double> avgEpRunTime(LinkedList<Show> shows) {
        double count = 0;
        double sum = 0;
        LinkedList<Double> averageEpRunTimes = new LinkedList<>();
        for (Show show : shows) {
            for (Episode episode : show.episodes) {
                count++;
                sum += episode.runTime;
            }
            if (count == show.episodes.size()) {
                double average = sum / count;
                averageEpRunTimes.add(average);
                count = 0;
                sum = 0;
            }
        }
        return averageEpRunTimes;
    }
}