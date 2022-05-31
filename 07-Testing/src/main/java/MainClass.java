import java.util.ArrayList;
import java.util.List;

/**
 * Main class.
 */
public class MainClass {
  /**
   * main function.
   */
  public static void main(String[] args) {
    int[] numbs = new int[]{1,2,3,4};
    int maxNo = findMax(numbs);
    System.out.println(maxNo);
  }

  /**
   * max no function.
   */
  public static int findMax(int[] nums) {
    int max = 0;
    for (int num : nums) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  /**
   * find min function.
   * @param numbs represents numbs
   * @return an int
   */
  public static int findMin(int[] numbs) {
    int min = numbs[0];
    for (int num : numbs) {
      if (num < min) {
        min = num;
      }
    }
    return min;
  }
}
