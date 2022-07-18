package Testing.enviroment;
import java.util.Scanner;

public class App {
  static int number;
  static int multiplier;
  static Scanner keyboardInput = new Scanner(System.in);
  static public void main(String[] args) {
    input();
    calculate();
    System.out.println("Calculation finished!");
  }

  public static void input() {
    System.out.println("First number: ");
    number = keyboardInput.nextInt();
    System.out.println("Second number: ");
    multiplier = keyboardInput.nextInt();
  }

  public static void calculate() {
    int i =0;
    for (; i < multiplier; i++) {
      System.out.print(number + " to the power of " + (i + 1));
      number *= number;
      System.out.println(" = " + number);
    }
  }
}
