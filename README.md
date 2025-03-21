[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18804401)
# unit-8-2021-frq-nonzero

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions
This question involves manipulating a two-dimensional array of integers.  You will write two `static` methods of the `ArrayResizer` class, which is shown below.
```java
public class ArrayResizer
{
  /** Returns true if and only if every value in row r of array2D is non-zero.
   * Precondition: r is a valid row index in array2D
   * Postcondition: array2D is unchanged
   */
  public static boolean isNonZeroRow(int[][] array2D, int r)
  { /* to be implemented in part (a) */ }

  /** Returns the number of rows in array2D that contain all non-zero values.
   * Postcondition: array2D is unchanged.
   */
  public static int numNonZeroRows(int[][] array2D)
  { /* implementation not shown */ }

  /** Returns a new, possibly smaller, two-dimensional array that contains only rows
   * from array2D with no zeros, as described in part (b).
   * Precondition: array2D contains at least one column and at least one row with no zeros.
   * Postcondition: array2D is unchanged.
   */
  public static int[][] resize(int[][] array2D)
  { /* to be implmented in part (b) */ }
}
```

## Part A
Write the method `isNonZeroRow`, which returns `true` if and only if all elements in row `r` of a two-dimensional array `array2D` are not equal to zero.

For example, consider the following statement, which initializes a two-dimensional array.
```java
int[][] arr = {{2, 1, 0},
               {1, 3, 2},
               {0, 0, 0},
               {4, 5, 6}};
```

Sample calls to `isNonZeroRow` are shown below.
|Call to `isNonZeroRow`|Value Returned|Explanation|
|---|---|---|
|`ArrayResizer.isNonZeroRow(arr, 0)`|`false`|At least one value in row `0` is zero.|
|`ArrayResizer.isNonZeroRow(arr, 1)`|`true`|All values in row `1` are non-zero.|
|`ArrayResizer.isNonZeroRow(arr, 2)`|`false`|At least one value in row `2` is zero.|
|`ArrayResizer.isNonZeroRow(arr, 3)`|`true`|All values in row `3` are non-zero.|

Complete the `isNonZeroRow` method.

```java
/** Returns true if and only if every value in row r of array2D is non-zero.
 * Precondition: r is a valid row index in array2D
 * Postcondition: array2D is unchanged
 */
public static boolean isNonZeroRow(int[][] array2D, int r)
```

## Part B
Write the method `resize`, which returns a new two-dimensional array containing only rows from `array2D` with all non-zero values.  The elements in the new array should appear in the same order as the order in which they appeared in the original array.

The following code segment initializes a two-dimensional array and calls the `resize` method.

```java
int[][] arr = {{2, 1, 0},
               {1, 3, 2},
               {0, 0, 0},
               {4, 5, 6}};
int[][] smaller = ArrayResizer.resize(arr);
```

When the code segment completes, the following will be the contents of `smaller`.

`{{1, 3, 2}, {4, 5, 6}}`

A helper method, `numNonZeroRows`, has been provided for you.  The method returns the number of rows in its two-dimensional array parameter that contain no zero values.

Complete the `resize` method.  Assume that `isNonZeroRow` works as specified, regardless of what you wrote in part (a).  You must use `numNonZeroRows` and `isNonZeroRow` appropriately to receive full credit.

```java
/** Returns a new, possibly smaller, two-dimensional array that contains only rows
 * from array2D with no zeros, as described in part (b).
 * Precondition: array2D contains at least one column and at least one row with no zeros.
 * Postcondition: array2D is unchanged.
 */
public static int[][] resize(int[][] array2D)
```
