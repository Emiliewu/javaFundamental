import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class PuzzleJavaTest {
  public static void main(String[] args) {
    PuzzleJava t = new PuzzleJava();
  //print sum and return an new array with values greater than 10;
    int[] array1 = {3,5,1,2,7,9,8,13,25,32};
    ArrayList res1 = t.arrayGt10(array1);
    System.out.println("The new Array is " + res1);

  // shuffle and print the array, return a new array with name longer than 5 charactors
    String[] array2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    ArrayList res2 = t.arrayLt5(array2);
    System.out.println("The names with charactors more than 5 are: " + res2);
  // alphabet
    t.arrAlphabet();
  //  Generate and return an array with 10 random numbers between 55-100.
    int[] res3 = t.arrRandom();
    System.out.println("The 10 random numbers between 55-100 are: " + Arrays.toString(res3));
  // Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    int[] res4 = t.arrSort();
    System.out.println("The sorted random numbers between 55-100 are: " + Arrays.toString(res4));
  //Create a random string that is 5 characters long.
    String res5 = t.strRandom();
    System.out.println("The random string is: " + res5);
  //Generate an array with 10 random strings that are each 5 characters long
    String[] res6 = t.strArray();
    System.out.println("The random string array is: " + Arrays.toString(res6));

  }
}