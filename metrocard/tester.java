public class tester {
  double bal;
  int swipe;
  String type;
  String expiration;

  public tester(double bal, String type) {
    if(type == "student") {
      this.bal = -1;
      this.swipe = 3;
      this.type = "student";
      this.expiration = "4 months";
    }
    if(type == "normal") {
      this.bal = bal;
      this.swipe = (int)(bal/2.75);
      this.type = "normal";
      this.expiration = "1 year";
    }
    if(type == "monthly") {
      this.bal = -1;
      this.swipe = 9999*9999;
      this.type = "monthly";
      this.expiration = "1 month";
    }
  }

  public void useSwipe() {
    if((this.swipe >= 1) && (this.bal >= 2.75)) {
    this.swipe -= 1;
    this.bal -= 2.75;
    }
  }

  public String getName() {
    return this.type;
  }

  public String getBal() {
    if((this.type.equals("student")) || (this.type.equals("monthly"))) {
      return "N/A";
    }
    return "$" + this.bal + " left in your account";
  }

  public String getSwipe() {
    if(this.swipe > 100) {
      return "infinite";
    }
    return this.swipe + " swipes left";
  }

  public String getExpiration() {
    return "Expires in " + this.expiration;
  }
}
