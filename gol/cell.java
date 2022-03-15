public class cell {
  private int x;
  private int y;

  public cell(int x, int y) {
    this.x= x;
    this.y = y;
  }


  public String[][] createBoard() {
    String[][] board = new String[this.x][this.y];
    for(int x=0; x<this.x; x++) {
      for(int y=0; y<this.y; y++) {
        if(Math.random() >= .2) {
          board[x][y] = " X ";
        } else {
          board[x][y] = " O ";
        }
      }
    }
    return board;
  }

  public void displayBoard(String[][] board) {
    for(int x=0; x<this.x; x++) {
      for(int y=0; y<this.y; y++) {
        System.out.print(board[x][y]);
      }
      System.out.println("");
    }
  }

  public int countNeighbor(int x, int y, String[][] board) {
    int count = 0;

    for(int i = -1; i <= 1; i++) {
      for(int j = -1; j <= 1; j++) {
        System.out.print(board[x+j][y+i]);
        System.out.print(" (" + (x + j));
        System.out.print(", " + (y + i) + ")");
        System.out.println(getStatus(x + j, y + i, board));
        if(getStatus((x + j), (y + i), board) == 1) {
          count++;
        }
      }
    }

    if(getStatus(x, y, board) == 1) {
      count--;
    }
    return count;
  }
    public int getStatus(int x, int y, String[][] board) {
      if(board[x][y].equals(" O ")) {
        return 1;
      } else {
        return -1;
      }
    }
}
