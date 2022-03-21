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

  public void split() {
    ArrayList player1 = new ArrayList<Card>();
    ArrayList player2 = new ArrayList<Card>();
    for(int i = 0; i<26; i++) {
      player1.add(this.deck.get(i));
      player2.add(this.deck.get(i+25));
    }
    System.out.println(player1);
    System.out.println(player2);
  }

  public void outShuffle() {
    ArrayList<Card> sub1 = new ArrayList<Card>();
    ArrayList<Card> sub2 = new ArrayList<Card>();
    for(int i = 0; i < 26; i++) {
      sub1.add(this.deck.get(i));
      sub2.add(this.deck.get(i+26));
    }
    int index = 51;
    for(int i = 25; i > 0; i--) {
      this.deck.set(index, sub1.get(i));
      index--;
      this.deck.set(index, sub2.get(i));
      index--;
    }
    System.out.println(this.deck);
  }
} // end class
