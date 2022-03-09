public class cell {
  private int x;
  private int y;
  private int status;
  private array board;

  public cell(int x, int y, int status, array board) {
    this.x = x;
    this.y = y;
    this.status = status;
    this.array = array;
  }

    public String getStatus() {
      if(this.status == 0) {
        return "X"; //dead
      }
        return "O"; //alive
      }
    }

    public int centerNeighbor() {
      int counter = 0;
      if(board[this.x-1][this.y-1].equals("O")) {
        counter++;
      }
      if(board[this.x][this.y-1].equals("O")) {
        counter++;
      }
      if(board[this.x+1][this.y-1].equals("O")) {
        counter++;
      }
      if(board[this.x+1][this.y-1].equals("O")) {
        counter++;
      }
      if(board[this.x-1][this.y-1].equals("O")) {
        counter++;
      }
      if(board[this.x][this.y-1].equals("O")) {
        counter++;
      }
      if(board[this.x+1][this.y-1].equals("O")) {
        counter++;
      }
      if(board[this.x+1][this.y-1].equals("O")) {
        counter++;
      }

    public int condition() {
      if()
    }


    public String setStatus() {
      if
    }
  }
}
