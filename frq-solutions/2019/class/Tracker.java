public class Tracker {
  public static void main(String[] args) {
    stepTracker day1 = new stepTracker(11000);
    day1.addDailySteps(15000);
    day1.addDailySteps(9000);
    day1.addDailySteps(13000);
    System.out.println(day1.activeDays());
    System.out.println(day1.averageSteps());
  }
}
