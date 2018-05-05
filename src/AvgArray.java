import java.util.Scanner;

public class AvgArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value: ");
        int x = scanner.nextInt();

        int[] a = new int[x];
        for(int i = 0; i < x; i++){
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        int total = 0;
        for(int i = 0; i < x; i++){
            total = total + a[i];
        }
        double average = ((double) total)/x;
        System.out.println();
        System.out.println("The average of the array is " + average + ".");
    }
}
