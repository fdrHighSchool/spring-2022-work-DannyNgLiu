public class tester {
  private String expire;
  private int swipe;
  private String type;
  private double bal;


public tester(String expire, double bal) {
  this.expire = expire;
  this.bal = bal;
}

public tester(int swipe, String expire, String type) {
  this.swipe = swipe;
  this.expire = expire;
  this.type = type;
}


public void otherSwipe() {
    this.swipe -= 1;
    System.out.println(this.swipe);
  }

public void normalSwipe() {
  this.bal -= 2.75;
  System.out.println(this.bal);
}
}
