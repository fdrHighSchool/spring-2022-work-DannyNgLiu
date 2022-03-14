import java.util.*;
public class main {
  public static void main(String[] args) {
    cell game = new cell(10,10);
    cell status = new cell("1");

    game.displayBoard(game.createBoard());
  }
}
