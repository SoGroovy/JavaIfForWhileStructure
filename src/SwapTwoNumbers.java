import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        int a = 15;
        int b = 10;
        System.out.println("before swapping: a = " + a + " b= " + b);
        int x = a;
        a = b;
        b = x;

        System.out.println("after swapping: a = " + a + " b= " + b);
    }
}
