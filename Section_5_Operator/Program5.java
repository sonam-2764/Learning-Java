package Section_5_Operator;

public class Program5 {
    public static void main(String[] args) {
        int x =5, y = 4, z;
        z = 2*x++ + 3 * ++y;
        // 2*5  + 3*5
        System.out.println(z);
    }
}
