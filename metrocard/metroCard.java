public class metroCard {
  public static void main(String[] args){
    tester metro1 = new tester(5.50, "student");
    System.out.println(metro1.getBal());
    metro1.useSwipe();
    System.out.println(metro1.getName());
    System.out.println(metro1.getBal());
    System.out.println(metro1.getSwipe());
    System.out.println(metro1.getExpiration());
  }
}
