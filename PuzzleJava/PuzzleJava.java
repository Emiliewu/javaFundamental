import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class PuzzleJava {
  //print sum and return an new array with values greater than 10;
  public ArrayList arrayGt10(int[] arr) {
    int sum = 0;
    ArrayList<Integer> res = new ArrayList<Integer>();
    for (int n: arr) {
      sum = sum + n;
      if (n > 10) {
        res.add(n);
      }
    }
    System.out.println("The sum is " + sum);
    return res;
  }
  // shuffle and print the array, return a new array with name longer than 5 Characters
  public ArrayList arrayLt5(String[] arr) {
    ArrayList<String> res = new ArrayList<String>();
    ArrayList<String> arrayshuffle = new ArrayList<String>();
    for (String name: arr) {
      if (name.length() > 5) {
        res.add(name);
      }
      arrayshuffle.add(name);
    }
    Collections.shuffle(arrayshuffle);
    System.out.println("shuffled name are " + arrayshuffle);
    return res;
  }
  //alphabet
  public void arrAlphabet() {
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    ArrayList<Character> alphabetshuffle = new ArrayList<Character>();
    char[] vowel = "aeiou".toCharArray();
    for (char c: alphabet) {
      alphabetshuffle.add(c);
    }
    Collections.shuffle(alphabetshuffle);
    System.out.println("The last letter now is " + alphabetshuffle.get(alphabetshuffle.size()-1));
    System.out.println("The first letter now is " + alphabetshuffle.get(0));
    for (char v: vowel) {
      if (alphabetshuffle.get(0) == v) {
        System.out.println("The first letter " + v + " is an vowel");
      } 
    }
  }
  //Generate and return an array with 10 random numbers between 55-100.
  public int[] arrRandom() {
    int[] arr;
    arr = new int[10];
    for (int i = 0; i < 10; i++) {
      Random r = new Random();
      arr[i] = r.nextInt(45)+55;
    }
    return arr;
  }
  // Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
  public int[] arrSort() {
    ArrayList<Integer> arrlist = new ArrayList<Integer>();
    int[] arr;
    arr = new int[10];
    for (int i = 0; i < 10; i++) {
      Random r = new Random();
      arrlist.add(r.nextInt(45) + 55);
    }
    Collections.sort(arrlist);
    for (int i = 0; i < 10; i++) {
      arr[i] = arrlist.get(i);
    }
    return arr;
  }
  //Create a random string that is 5 characters long.
  public String strRandom() {
    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789"+ "abcdefghijklmnopqrstuvxyz";
    String res = "";
    for (int i = 0; i < 5; i++) {
      Random r = new Random();
      res = res + AlphaNumericString.charAt(r.nextInt(AlphaNumericString.length()));
    }
    return res;
  }
  //Generate an array with 10 random strings that are each 5 characters long
  public String[] strArray() {
    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
    String[] arr;
    arr = new String[10];
    String str = "";
    for (int j = 0; j < 10; j++) {
      for (int i = 0; i < 5; i++) {
        Random r = new Random();
        str = str + AlphaNumericString.charAt(r.nextInt(AlphaNumericString.length()));
      }
      arr[j] = str;
      str = "";
    }
    return arr;
  }
}

