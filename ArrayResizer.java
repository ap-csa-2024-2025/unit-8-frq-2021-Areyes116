public class ArrayResizer
{
  /** Returns true if and only if every value of row r in array2D is nonzero.
   * Precondition: r is a valid row of array2D.
   * Postcondition: array2D is unchanged.
   */
  public static boolean isNonZeroRow(int[][] array2D, int r)
  {
      for (int col = 0; col < array2D[r].length; col++)
      {
          if (array2D[r][col] == 0)
          {
              return false;
          }
      }
      return true;
  }

  /** Returns the number of rows of array2D that contain all nonzero values.
   * Postcondition: array2D is unchanged.
   */
  public static int numNonZeroRow(int[][] array2D)
  {
      int count = 0;
      for (int row = 0; row < array2D.length; row++)
      {
          if (isNonZeroRow(array2D, row))
          {
              count++;
          }
      }
      return count;
  }

  /** Returns a new, possibly smaller, two-dimensional array that contains only rows
   * from array2D with no zeros, as described in part (b).
   * Precondition: array2D contains at least one column and at least one row with no zeros.
   * Postcondition: array2D is unchanged.
   */
  public static int[][] resize(int[][] array2D)
  {
      int rowCount = numNonZeroRow(array2D);
      int[][] result = new int[rowCount][array2D[0].length];
      
      int index = 0;
      for (int row = 0; row < array2D.length; row++)
      {
          if (isNonZeroRow(array2D, row))
          {
              result[index] = array2D[row];
              index++;
          }
      }
      return result;
  }

  // Testing the solution
  public static void main(String[] args)
  {
      int[][] arr = {{2, 1, 0},
                     {1, 3, 2},
                     {0, 0, 0},
                     {4, 5, 6}};
      
      int[][] smaller = ArrayResizer.resize(arr);

      for (int[] row : smaller)
      {
          for (int value : row)
          {
              System.out.print(value + " ");
          }
          System.out.println();
      }
  }
}
