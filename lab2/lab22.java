import java.util.Scanner;

public class Lr22 {
  public static void main(String[] args) {
    double x1, x2, x3, y1, y2, y3;
    x1 = 2; x2 = 4; x3 = -2;
    y1 = 2; y2 = 0; y3 = 6;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of x4: ");
    double x4 = sc.nextDouble();
    System.out.println("Enter the value of x5: ");
    double x5 = sc.nextDouble();
    System.out.println("Enter the value of x6: ");
    double x6 = sc.nextDouble();
    System.out.println("Enter the value of y4: ");
    double y4 = sc.nextDouble();
    System.out.println("Enter the value of y5: ");
    double y5 = sc.nextDouble();
    System.out.println("Enter the value of y6: ");
    double y6 = sc.nextDouble();
    System.out.println("Enter the value of R1: ");
    double R1 = sc.nextDouble();
    System.out.println("Enter the value of R2: ");
    double R2 = sc.nextDouble();
    System.out.println("Enter the value of R3: ");
    double R3 = sc.nextDouble();

    sc.close();
    System.out.println("\nTask 3 initial variables");
    System.out.printf("%nx1 = %.4f%nx2 = %.4f%nx3 = %.4f%n", x4, x5, x6);
    System.out.printf("%ny1 = %.4f%ny2 = %.4f%ny3 = %.4f%n", y4, y5, y6);
    System.out.printf("%nR1 = %.4f%nR2 = %.4f%nR3 = %.4f%n%n", R1, R2, R3);

    System.out.printf("The radius of a circle with the first set of numbers: %.1f%n", +task3(x4, y4, R1));
    System.out.printf("The radius of a circle with the second set of numbers: %.1f%n", +task3(x5, y5, R2));
    System.out.printf("The radius of a circle with the third set of numbers: %.1f%n", +task3(x6, y6, R3));

    System.out.println("\n\nTask 4 initial variables: ");
    System.out.printf("%nx1 = %.1f%ny1 = %.1f%n", x1,y1);
    System.out.printf("%nx2 = %.1f%ny2 = %.1f%n", x2, y2);
    System.out.printf("%nx3 = %.1f%ny3 = %.1f%n", x3, y3);
    task4(x1, y1, x2, y2, x3, y3);
  }

  public static double task3(double x, double y, double R) {
    double c = Math.pow(0 - x, 2) + Math.pow(0 - y, 2);
    if (c <= R) {
      System.out.println("The point is inside the circle.");
    } else {
      System.out.println("The point is outside the circle.");
    }
    return R;
  }

  public static void task4(double x1, double y1, double x2, double y2, double x3, double y3) {
    if (((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))) 
      System.out.println("\nThree points are on one line.");
     else 
      System.out.println("\nThree points aren't on one line");
  }
}
