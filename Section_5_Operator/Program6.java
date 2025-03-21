package Section_5_Operator;

public class Program6 {
    public static void main(String[] args) {
        int x=10,y=6,z;
        // we can also write int x=0b1010 which is binary form of 10
        //int x=0b1010;int y = 0b0110;int z; then sout will give same result
        z=x&y;
        System.out.println(z);
        z=x|y;
        System.out.println(z);
        z=x^y;
        System.out.println(z);
        int a =10, b;
        // int a= 0b1010; will give same result
        b=x<<1;
        System.out.println(b);
        int c = -10;
        int d =c>>1;
        System.out.println(d);
        int e = c>>>1;
        System.out.println(e);
        int f = 0b1010;
        int g =~f;
        System.out.println(g);

    }
    
}
