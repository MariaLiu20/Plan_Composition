import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
  Earthquake1 E1 = new Earthquake1();
  LinkedList<Double> noData = new LinkedList<Double>();
  LinkedList<Double> threeDates = new LinkedList<Double>();
  LinkedList<MaxHzReport> AugReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> SepReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> OctReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();
  
  public EarthquakeExamples() {
    threeDates.add(20150801.0);
    threeDates.add(0.0);
    threeDates.add(0.0);
    threeDates.add(0.0);
    threeDates.add(20150913.0);
    threeDates.add(0.0);
    threeDates.add(-1.0);
    threeDates.add(20151013.0);
    threeDates.add(10.0);
    threeDates.add(5.0);
    threeDates.add(20151020.0);
    threeDates.add(40.0);
    threeDates.add(50.0);
    threeDates.add(45.0);
    threeDates.add(20151101.0);
    threeDates.add(6.0);
    threeDates.add(20151201.0);
    threeDates.add(-1.0);
    threeDates.add(2.0);
    threeDates.add(3.0);
    threeDates.add(20151202.0);
    threeDates.add(-1.0);
    threeDates.add(4.0);
    threeDates.add(5.0);

    AugReports.add(new MaxHzReport(20150801.0, 0.0));
    SepReports.add(new MaxHzReport(20150913.0, 0.0));
    OctReports.add(new MaxHzReport(20151013.0, 10.0));
    OctReports.add(new MaxHzReport(20151020.0, 50.0));
    NovReports.add(new MaxHzReport(20151101.0,6.0));
    DecReports.add(new MaxHzReport(20151201.0, 3.0));
    DecReports.add(new MaxHzReport(20151202.0, 5.0));
  }

  @Test
  public void instructorTestEQ() { 
    assertEquals(NovReports, E1.dailyMaxForMonth(threeDates, 11));
  }
  @Test
  public void testOctEQ() {
    assertEquals(OctReports, E1.dailyMaxForMonth(threeDates, 10));
  }
  @Test
  public void testDecEQ() {
    assertEquals(DecReports, E1.dailyMaxForMonth(threeDates, 12));
  }
  @Test
  public void testSepEQ() {
    assertEquals(SepReports, E1.dailyMaxForMonth(threeDates, 9));
  }
  @Test
  public void testAugEQ() {
    assertEquals(AugReports, E1.dailyMaxForMonth(threeDates, 8));
  }


}
  /*
  Subtasks for Problem 3:
  - create a list of MaxHzReport's
  - loop through the list of sensor data
      - if the data is a date and the month of the date matches the given month
          - search the following data while it is not a date and > 0
              - compare each reading to a max value
          - if the following data is a date or at the end of the list
              - add a new MaxHzReport object with the date and the max value to the list
              - reset the max
              - exit the loop
  - return the ist of reports
   */