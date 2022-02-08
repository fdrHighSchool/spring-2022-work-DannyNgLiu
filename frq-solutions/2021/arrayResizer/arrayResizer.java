import java.util.*;
class arrayResizer {
  public static void main(String[] args) {
    int[][] arr = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}, {1, 0, 4}};
    System.out.println(isNonZeroRow(arr, 1));
    System.out.println(numNonZeroRows(arr));
    System.out.println(Arrays.deepToString(resize(arr)));
  }
  public static boolean isNonZeroRow(int[][] array2D, int r) {
    for(int i = 0; i<array2D[r].length; i++) {
      if(array2D[r][i] == 0) {
        return false;
      }
    }
    return true;
  }
  public static int numNonZeroRows(int[][] array2D) {
    int index = 0;
    for(int w=0; w<array2D.length; w++) {
      for(int q=0; q<array2D[0].length; q++) {
        if(array2D[w][q] == 0) {
          index--;
          break;
        }
      }
      index++;
    }
    return index;
  }
  public static int[][] resize(int[][] array2D) {
    int index = 0;
    int[][] newArray = new int[numNonZeroRows(array2D)][array2D[0].length];
    for(int i=0; i<array2D.length; i++) {
      if(isNonZeroRow(array2D,i)) {
        newArray[index] = array2D[i];
        index++;
      }
    }
    return newArray;
  }
}
