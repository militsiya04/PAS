import java.lang.Math;

public class Lr21 {
    public static void main (String [] args ) {
        double a1, b2, b3, c1, c2, c3, m, n, k, x1, x2, x3;
        int a2, a3, b1;
        x1 = -2.3; x2 = 0.6; x3 = 4.8;
        m = 2.1; n = 1.9; k = 8.5;
        a1 = 0.1; a2 = 10; a3 = 100;
        b1 = 10; b2 = 10.05; b3 = 3.03;
        c1 = 11.12; c2 = 6.2; c3 = 7.12;
        
        System.out.println("\nTask 1 initial variables: ");
        System.out.printf ("\nm = %.4f\nn = %.4f\nk = %.4f\n\n", m, n, k);
        
        System.out.println("Task 1 results: \n ");
        System.out.printf("y1 = %.4f\n", + task1(x1,m,n,k));
        System.out.printf("y2 = %.4f\n", + task1(x2,m,n,k));
        System.out.printf("y3 = %.4f\n\n",   + task1(x3,m,n,k));

        System.out.println("Task 2 initial variables: ");
        System.out.printf ("\na1 = %.4f  \n", a1);
        System.out.printf ("b1 = %d  \n", b1);
        System.out.printf ("c1 = %.4f  \n", c1);
        System.out.printf ("\na2 = %d  \n", a2);
        System.out.printf ("b2 = %.4f  \n", b2);
        System.out.printf ("c2 = %.4f  \n", c2);
        System.out.printf ("\na3 = %d  \n", a3);
        System.out.printf ("b3 = %.4f  \n", b3);
        System.out.printf ("c3 = %.4f  \n\n", c3);
        
        System.out.println("Task 2 results: \n ");
        System.out.printf("y1 = %.4f\n", + task2(a1,b1,c1,x1));
        System.out.printf("y2 = %.4f\n", + task2(a2,b2,c2,x2));
        System.out.printf("y3 = %.4f\n\n",   + task2(a3,b3,c3,x3));
        System.out.printf("y4 = %.4f\n", + task2(a1,b1,c1,x2));
        System.out.printf("y5 = %.4f\n", + task2(a2,b2,c2,x3));
        System.out.printf("y6 = %.4f\n\n",   + task2(a3,b3,c3,x1));
        System.out.printf("y7 = %.4f\n", + task2(a1,b1,c1,x3));
        System.out.printf("y8 = %.4f\n", + task2(a2,b2,c2,x1));
        System.out.printf("y9 = %.4f\n\n",   + task2(a3,b3,c3,x2));
    }
    public static double task1 (double m, double n, double k, double x) {
        double y;
        if (x > (Math.abs(m + n))) {
            y = Math.log((Math.abs(Math.log10((k * x) + (m * n)))));
            return y;
        }
        else if (x == (Math.abs(m + n))) {
            y = Math.sin(k * m * x) + Math.sqrt(Math.abs(n * x));
            return y;
        }
        else if (x < (Math.abs(m + n))) {
            y = Math.pow (Math.E, Math.cos(x)) + Math.pow(Math.E, m + n);
            return y;
        }
        return m;
    }

    public static double task2(double a, double b, double c, double x) {
        double y;
        if (x > (Math.log10(a))) {
            y = Math.cbrt(Math.pow(b,2)+ Math.sqrt(Math.abs(x + c)));
            return y;
        }
        else if (x == Math.log10(a)) {
            y = Math.cos(x - b - c);
            return y;
        }

        else if (x < (Math.log10(a))) {
            y = Math.sin(x + a - b);
            return y;
        }
        return a;
    }
}
