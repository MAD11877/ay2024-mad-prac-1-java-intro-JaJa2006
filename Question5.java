import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int[] numberArr = new int[num];
    int[] timesNumberAppears = new int[num];
    for (int i = 0; i < num; i++) {
      int numInSet = in.nextInt();
      numberArr[i] = numInSet; 
    }
    int max = 0;
    int index = 0;
    for (int i : numberArr) {
      for (int j : numberArr) {
        if (i == j) {
          timesNumberAppears[i]++;
        }
      }
      if (timesNumberAppears[i] > max) {
        max = timesNumberAppears[i];
        index = i;
      }
    }
    System.out.print(numberArr[index]);
    
  }
}
