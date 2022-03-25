import java.util.*;

public class Driver {
  public static void main(String[] args) {

    // create a deck for testing
    Deck deck1 = new Deck();
    System.out.println(deck1.getLength()); // 52 cards in a standard deck
    //deck shuffle
    deck1.shuffle();
    ArrayList<Card> p1 = new Arraylist<Card>();
    ArrayList<Card> p2 = new Arraylist<Card>();
    for(int i = 0; i<26; i++) {
      p1.add(deck1.get(i));
      p2.add(deck1.get(i+2));
    }
  }
}
