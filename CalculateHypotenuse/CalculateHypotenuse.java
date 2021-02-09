import java.util.Scanner;
public class CalculateHypotenuse {
  public static void main(String[] args) {
    System.out.println("Enter first side triangle: ");
    Scanner inputA = new Scanner(System.in);
    int legA = inputA.nextInt();
    System.out.println("Enter second side triangle: ");
    Scanner inputB = new Scanner(System.in);
    int legB = inputB.nextInt();
    Pythagorean p = new Pythagorean();
    double hypotenuse = p.calculateHypotenuse(legA, legB);
    System.out.println(hypotenuse);
    inputA.close();
  }
}