import java.util.ArrayList;
import java.util.Arrays;
public class BasicJavaTest {
  public static void main(String[] args) {
    BasicJava t = new BasicJava();
  // print 1 to 255
    t.prt255();
  // print odd between 1 to 255
    t.prtOdd();
  // print sum from 0 to 255
    t.prtSum();
  //Iterating through an array
    int[] x = {1, 3, 5, 7, 9, 13};
    t.thrArr(x);
  //Find Max
    int[] y = {-3, -5, -7};
    t.findMax(y);
  //Get Average
    double[] z = {2, 10, 3};
    t.findAvg(z);
  //Array with Odd Numbers between 1 to 255
    ArrayList<Integer> arr = t.arrOdd();
    System.out.println(arr);
  //Greater Than Y
    int[] array = {1, 3, 5, 7};
    int y2 = 3;
    ArrayList<Integer> resarr = t.gtY(array, y2);
  //Square the values
    System.out.println(resarr);
    int[] array2 = {1, 5, 10, -2};
    int[] arrSqr = t.arrSqr(array2);
    System.out.println(Arrays.toString(arrSqr)); 
  //Eliminate Negative Numbers
    int[] array3 = {1, 5, 10, -2};
    int[] arrnoneg = t.noNeg(array3);
    System.out.println(Arrays.toString(arrnoneg));
  //Max, Min, and Average
    double[] array4 = {1, 5, 10, -2};
    double[] arrAnalysis = t.arrAnalysis(array4);
    System.out.println(Arrays.toString(arrAnalysis));
  //Shifting the Values in the Array
    int[] array5 = {1, 5, 10, 7, -2};
    int[] arrShift = t.arrShift(array5);
    System.out.println(Arrays.toString(arrShift));
  }
}