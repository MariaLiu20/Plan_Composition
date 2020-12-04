import java.util.LinkedList;

/**
 * Contains a method that smooths a set of run-times for shows
 */
class DataSmooth1 {
  DataSmooth1(){}

    /**
     * calculates the average runtime for each show
     * @param shows
     * @return list of the smoothed runTime values
     */
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) 
  {
      LinkedList<Double> runtimes = new LinkedList<Double>();
      LinkedList<Double> smoothRuntimes = new LinkedList<Double>();
      if (shows.size() != 0) {
          for (Show s : shows) {
              Double epsLength = 0.0;
              for (Episode e : s.episodes) {
                  epsLength += (Double) e.runTime;
              }
              runtimes.add(epsLength / s.episodes.size());
          }
          smoothRuntimes.add(runtimes.get(0));
          if(runtimes.size() != 1){
              for (int i = 1; i < runtimes.size() - 1; i++) {
                  smoothRuntimes.add((runtimes.get(i - 1) + runtimes.get(i) + runtimes.get(i + 1)) / 3);
              }
              smoothRuntimes.add(runtimes.getLast());
              return smoothRuntimes;
          }
          return smoothRuntimes;
      }
      return smoothRuntimes;
  }
}