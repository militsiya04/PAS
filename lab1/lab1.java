import java.util.Date;
import java.lang.Math;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double x, y, z;
    x = 1.825;
    y = 18.225;
    z = -3.298;

    System.out.printf("x = %.4f\ny = %.4f\nz = %.4f\n", x, y, z);
    System.out.printf("CalcC = %.4f\nCalcF = %.4f\n", calcC(x, y), calcF(x, y, z));

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of x: ");
    x = sc.nextDouble();
    System.out.print("Enter the value of y: ");
    y = sc.nextDouble();

    sc.close();

    System.out.printf("CalcC = %.4f\nCalcF = %.4f\n", calcC(x, y), calcF(x, y, z));

    outputDate();
  }

  public static double calcC(double x, double y) {
    return Math.abs(Math.pow(x, y / x) - Math.cbrt(y / x));
  }

  public static double calcF(double x, double y, double z) {
    return (y - x) * (y - (z / (y - x))) * (1 + Math.pow((y - x), 2));
  }

  public static void outputDate() {
    Date d = new Date();
    System.out.printf("The time is:\n%1$tH:%1$tM %1$te-%1$tm-%1$tY\n", d);
  }
}
