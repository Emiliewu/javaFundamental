import java.util.Scanner;
public class FizzBuzzTest {
  public static void main (String[] args) {
    System.out.println("Please enter an integer: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    FizzBuzz test = new FizzBuzz();
    String res = test.fizzBuzz(number);
    System.out.println(res);
    input.close();
  }
}