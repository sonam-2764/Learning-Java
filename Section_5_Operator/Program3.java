package Section_5_Operator;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the coefficient of x^2 ");
        int a = sc.nextInt();
        System.out.println("enter the coefficient of x ");
        int b = sc.nextInt();
        System.out.println("enter the coefficient of constant ");
        int c = sc.nextInt();
        sc.close();
        double x1= (-b+ Math.sqrt(b*b -(4*a*c)))/(2*a);
        double x2= (-b- Math.sqrt(Math.pow(b, 2) -(4*a*c)))/(2*a);
        System.out.println("the roots of quadratic equation is "+ x1);
        System.out.println("the roots of quadratic equation is "+ x2);
    }
}
