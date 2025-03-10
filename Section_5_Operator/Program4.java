package Section_5_Operator;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the value of length");
        int a = ab.nextInt();
        System.out.println("enter the value of breadth");
        int b = ab.nextInt();
        System.out.println("enter the value of height ");
        int c =ab.nextInt();
        ab.close();
        int area = 2*((a*b)+(b*c)+(c*a));
        System.out.println("total area of cuboid is "+area);
        int volume = a*b*c;
        System.out.println("the volume of cuboid is "+volume);

    }
    
}
