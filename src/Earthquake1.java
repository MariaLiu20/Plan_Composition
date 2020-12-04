import java.util.LinkedList;

/**
 * Represents an earthquake
 */
class Earthquake1 {
  Earthquake1(){}

  // checks whether a datum is a date
  boolean isDate(double anum) {
    return (int)anum > 10000000;
  }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) {
    return ((int)dateNum % 10000) / 100;
  }

  /**
   * produces a list of reports indicating the highest frequency reading for each day in the given month
   * @param data is a list of sensor data (doubles)
   * @param month is an integer between 1 and 12
   * @return a list of MaxHzReport indicating the highest frequency redying for each day in that month
   */
  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {
    LinkedList<MaxHzReport> report = new LinkedList<MaxHzReport>();
    Double max = 0.0;

    for (int i = 0; i < data.size(); i++) {
      if (isDate(data.get(i))) {
        if (extractMonth(data.get(i)) == month) {
          for (int j = i+1; j < data.size(); j++) {
            if (!isDate(data.get(j)) && data.get(j) >= 0) {
              if (data.get(j) > max) {
                max = data.get(j);
              }
            }
            if (isDate(data.get(j)) || j == data.size()-1) {    //if end of measurements
              report.add (new MaxHzReport(data.get(i), max));
              max = 0.0;
              break;
            }
          }
        }
      }
    }
    return report;
  }
}
