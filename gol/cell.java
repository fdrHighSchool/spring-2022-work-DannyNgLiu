public class cell {
  private int x;
  private int y;
  private String status;

  public cell(int x, int y) {
    this.x= x;
    this.y = y;
  }

  public cell(String status) {
    this.status = status;
  }

  public String[][] createBoard() {
    String[][] board = new String[this.x][this.y];
    for(int x=0; x<this.x; x++) {
      for(int y=0; y<this.y; y++) {
        if(Math.random() >= .2) {
          board[x][y] = " O ";
        } else {
          board[x][y] = " X ";
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
        if(board[x + i][y + j].getStatus() == 1) {
          count++;
        }
      }
    }

    if(board[x][y].getStatus() == 1) {
      count--;
    }
  }
    public int getStatus() {
      if(board[x][y].equals(" O ")) {
        return 1;
      } else {
        return -1;
      }
    }
    //
    // public int countNeighbor(int x, int y, String[][] board) {
    //   for(int i = -1; i<=1; i++) {
    //     for(int q = -1; q<=1; q++) {
    //       if(board[x+i][y+q].getStatus == 1) {
    //         counter++;
    //       }
    //       if(board[x][y].getStatus == 1) {
    //         counter--;
    //       }
    //     }
    //
    //   }
    //
    // public int condition() {
    //   if()
    // }
    //
    //
    // public void setStatus() {
    //   this.status = this.status * -1;
    // }
}
