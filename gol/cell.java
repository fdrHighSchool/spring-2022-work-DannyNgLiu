public class cell {
  private String status;
  private array board;

  public cell(int x, int y, String status, array board) {
    this.status = status;
    this.array = array;
  }

    public int getStatus() {
      if(this.status.equals("O")) {
        return 1; //alive
      }
        return -1; //dead
      }
    }

    public int countNeighbor(int x, int y, String[][] board) {
      for(int i = -1; i<=1; i++) {
        for(int q = -1; q<=1; q++) {
          if(board[x+i][y+q].getStatus == 1) {
            counter++;
          }
          if(board[x][y].getStatus == 1) {
            counter--;
          }
        }

      }

    public int condition() {
      if()
    }


    public void setStatus() {
      this.status = this.status * -1;
    }
  }
}
