import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value: ");
        int x = scanner.nextInt();

        int[] a = new int[x];
        for(int i = 0; i < x; i++){
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + "  ");
        }
        int small = a[0];
        for(int i = 1; i < a.length; i++) {
            if (small > a[i]) {
                small = a[i];
            }
        }
        System.out.println();
        System.out.println("The smallest number is " + small + ".");
    }
}
