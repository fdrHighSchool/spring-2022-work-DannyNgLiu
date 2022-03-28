
public class lightBoard {

  private boolean[][] lights;

  public LightBoard(int numRows, int numCols) {
    boolean[][] lights = new boolean[numRows][numCols];
    for(int i=0; i<numRows; i++) {
      for(int q=0; q<numCols; i++) {
        if((int)(Math.random()*10) > 5) {  //0, 1, 2, 3, 4, 5, 6, 7, 8, 9   6, 7, 8, 9   40%
        lights[i][q] = true;
        } else {
          lights[i][q] = false;
        }
      }
    }
  }

  public evaluateLight(int userRow, int userCol) {
    int counter = 0;
    if(light[userRow][userCol] == true) {
      for(int i=0; i<numCols; i++) {
        if(lights[userRow][i] == true) {
          counter++;
        }
      }
      if(counter%2=0) {
        return false;
      } else {
        return true;
      }
    }
    counter = 0;
    if(light[userRow][userCol] == false) {
      for(int i=0; i<numCols; i++) {
        if(lights[userRow][i] == true) {
          counter++;
        }
      }
      if(counter%3=0) {
        return true;
      } else {
        return false;
      }
    }
  }
}
