import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava {
  // print 1 to 255
  public void prt255() {
    for (int i = 1; i <= 255; i++) {
      System.out.println(i);
    }
  }
  // print odd between 1 to 255
  public void prtOdd() {
    for (int i = 1; i <= 255; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
  // print sum from 0 to 255
  public void prtSum() {
    int sum = 0;
    for (int i = 0; i <= 255; i++) {
      sum = sum + i;
      System.out.println("New Number: " + i + " Sum: " + sum);
    }
  }
  //Iterating through an array
  public void thrArr(int[] x) {
    for (int i = 0; i < x.length; i++) {
      System.out.println(x[i]);
    }
  }
  //Find Max
  public void findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(max);
  }
  //Get Average
  public void findAvg(double[] arr) {
    double avg;
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    avg = sum / arr.length;
    System.out.println(avg);
  }
  //Array with Odd Numbers between 1 to 255
  public ArrayList arrOdd() {
    ArrayList <Integer> arr = new ArrayList <Integer>();
    for (int i = 1; i <= 255; i++) {
      if (i % 2 != 0) {
        arr.add(i);
      }
    }
    return arr;
  }     
  //Greater Than Y
  public ArrayList gtY(int[] arr, int y) {
    ArrayList <Integer> res = new ArrayList <Integer>(); 
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > y) {
        res.add(arr[i]);
      }
    }
    return res;
  }
  //Square the values
  public int[] arrSqr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] * arr[i];
    }
    // System.out.println(Arrays.toString(arr));
    return arr;
  }
  //Eliminate Negative Numbers
  public int[] noNeg(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] < 0) {
        arr[i] = 0;
      }
    }
    return arr;
  }
  //Max, Min, and Average
  public double[] arrAnalysis(double[] arr) {
    double max = arr[0];
    double min = arr[0];
    double sum = arr[0];
    double avg;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
      sum = sum + arr[i];
    }
    avg = sum / arr.length;
    double[] resArr = {max, min, avg};
    return resArr;
  }
  //Shifting the Values in the Array
  public int[] arrShift(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      arr[i-1] = arr[i];
    }
    arr[arr.length-1] = 0;
    return arr;
  }
}