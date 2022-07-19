package Testing.enviroment;
import java.util.HashMap;

public class MatrixReset0 {

  static HashMap<Integer , Integer> zeroLoc = new HashMap<Integer , Integer>();

  public void setZeroes(int[][] matrix) {
    findZero(matrix);
    for (int row = 0; row < matrix.length; row++) {
      for (int colnum = 0; colnum < matrix[row].length; colnum++)
        if (zeroLoc.get(row) != null) {
          matrix[row][colnum] = 0;
          int colnumber = zeroLoc.get(row);
          for (int rownum = 0; rownum < matrix.length; rownum++) {
            matrix[rownum][colnumber] = 0;
          }
        }
    }
    return;
  }
  public void findZero(int[][] matrix) {
    int col = 0;
    for (int rowCount = 0; rowCount < matrix.length; rowCount++) {
      int[] row = matrix[rowCount];
      for (int number : row) {
        if (number == 0) {
          zeroLoc.put(rowCount, col);
        }
        col += 1;
        col %= 3;
      }
    }
  }
}
