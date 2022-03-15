import java.util.*;
public class main {
  public static void main(String[] args) {
    cell game = new cell(10,10);

    game.displayBoard(game.createBoard());
    System.out.println("number of neighbors = " + game.countNeighbor(5, 5, game.createBoard()));
  }
}
