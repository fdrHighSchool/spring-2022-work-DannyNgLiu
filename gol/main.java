import java.util.*;
public class main {
  public static void main(String[] args) {

    String[][] board = new String[10][10];
    fillBoard(board);
    displayBoard(board);
    cell(board);
    System.out.println(cell.counterNeighbor(5,5,board));

}
  //creating the board
  public static void fillBoard(String[][] board) {
  for(int row = 0; row < board.length; row++) {
    for(int col = 0; col < board[row].length; col++) {
      board[row][col] = "[ ]";
      board[5][5] = " O ";

      // if(Math.random() < 0.2) {
      //   board[row][col] = " O ";
      // } else {
      //   board[row][col] = " X ";
      // }
    } // end inner loop
  } // end outer loop
} // end fillBoard method

public static void displayBoard(String[][] board) {
  for(int row = 0; row < board.length; row++) {
    for(int col = 0; col < board[row].length; col++) {
      System.out.print(board[row][col] + " ");
    } // end inner for loop
    System.out.println();
  } // end outer for loop
} // end displayBoard method

}
