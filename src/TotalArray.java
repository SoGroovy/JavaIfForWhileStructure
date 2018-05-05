import java.util.Scanner;

public class TotalArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value: ");

        int x  = scanner.nextInt();
        int[] a = new int[100];
        for(int i = 0; i < x; i++){
             a[i] = (int) (Math.random() * 100);
             System.out.print(a[i] + " ");
        }
        int total = 0;
        for(int i = 0; i < x; i++){
            total = total + a[i];
        }
        System.out.println();
        System.out.println("The total value of the array is " + total + ".");
    }
}
