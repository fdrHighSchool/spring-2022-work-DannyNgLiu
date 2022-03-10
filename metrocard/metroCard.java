public class metroCard {
  public static void main(String[] args){
    card metro1 = new card(5.50, "normal");
    System.out.println(metro1.getBal());
    metro1.useSwipe();
    System.out.println(metro1.getName());
    System.out.println(metro1.getBal());
    System.out.println(metro1.getSwipe());
    System.out.println(metro1.getExpiration());
  }
}
