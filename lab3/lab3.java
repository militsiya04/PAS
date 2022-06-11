import java.util.Scanner;
import static java.lang.Math.*;

public class Lr3 {
    public static void main(String[] args) {
        double h = 0.2, x_min = 0.3, x_max = 7.3;
        double[] seq1 = {25, 3, 14, 4, 4.5, 5, 5.432, 62, 6, 7};
        double[] seq2 = {2, 5.92, 3.47, 4.98, 5.21, 6.35, 7, 8.93, 9.75, 0.7};
      
        System.out.println("\nTask 1:");
        task1(x_min, x_max, h);
        
        System.out.println("\nTask 2:");
        System.out.printf ("%nFirst sequence calculation result: %.4f", + task2(seq1));
        System.out.printf ("%nSecond sequence calculation result: %.4f%n", + task2(seq2));
      
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTask 3: ");
        System.out.println("\nEnter the value of x1: ");
        double x1 = sc.nextDouble();
        System.out.println("\nEnter the value of x2: ");
        double x2 = sc.nextDouble();
      
        System.out.printf("%nx1 = %.4f%nx2 = %.4f%n", x1, x2);
        System.out.printf("%nTask 3 result (x1): %.4f%n", +task3(x1));
        System.out.printf("Task 3 result (x2): %.4f %n", +task3(x2));
    }
    public static void task1 (double x_min, double x_max, double h) 
    {
        double x, y, z;
        for (x = x_min; x <= x_max + h; x = x + h) 
        {
            y = Math.cos(x) / (x);
            z = Math.cos(x / 2);
            System.out.printf("x = %.1f\t\t", x);
          
            if (y > 0)
                System.out.printf("y(x) =  %.4f\t\t", y);
            
            else if (y < 0)
                System.out.printf("y(x) = %.4f\t\t", y);

            if (z > 0)
                System.out.printf("z(x) =  %.4f\n", z);
            else if (z < 0)
                System.out.printf("z(x) = %.4f\n", z);
        }
    }    
}

    public static double task2(double[] seq) {
        double s = 1;
        for (int i = 1; i < seq.length - 1; i++)
            s = s * (seq[i + 1] - seq[i]);
        
        return s;
    }

    public static double task3 (double x) {
        double y = 0, factorial;
        int q;
        for (int i = 1; i < 4; i++) {
            q = (2 * i) - 1;
            factorial = 1;
            int a = 1;
            while (a <= q) {
                factorial = factorial * a;
                a++;
            }
            y = y + Math.pow(x, 2 * i) * factorial / Math.pow(2, i);
        }
        return y;
    }
}
