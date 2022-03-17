import java.util.*;

public class Deck {
  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();

    for(int suit = 0; suit <= 3; suit++) {
      for(int value = 2; value <= 14; value++) {
        this.deck.add(new Card(value, suit));
      } // end inner for loop
    } // end outer for loop

  } // end constructor method

  public int getLength() {
    return deck.size();
  }

  public void displayDeck() {
    for(Card c : this.deck) {
      System.out.println(c);
    }
  }

  public void shuffle() {
    ArrayList<Card> shuffledDeck = new ArrayList<Card>();
    int totalCardsLeft = 52;
    int ranNum = 0;
    for(int i = 0; i<52; i++) {
    ranNum = (int)(Math.random()*totalCardsLeft);
    shuffledDeck.add(this.deck.get(ranNum));
    this.deck.remove(this.deck.get(ranNum));
    totalCardsLeft -= 1;
   }
   this.deck = shuffledDeck;
  }
} // end class
