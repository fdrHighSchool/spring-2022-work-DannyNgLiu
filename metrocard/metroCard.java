public class metroCard {
  public static void main(String[] args) {
    tester normalCard = new tester("3/27/2022", 5.50);
    tester otherCard = new tester(3, "6/18/2023", "student");

    normalCard.normalSwipe();
    normalCard.normalSwipe();
  }
}
