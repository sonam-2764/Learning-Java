//area of triamgle by method 2

package Section_5_Operator;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);
        System.out.println("enter the first side");
        float a = ab.nextFloat();
        System.out.println("enter the second side");
        float b = ab.nextFloat();
        System.out.println("enter the third side");
        float c = ab.nextFloat();
        ab.close();
        float s = (a+b+c)/2f;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area is " +area);


    }
}
