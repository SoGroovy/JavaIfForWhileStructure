import java.util.Scanner;

public class BiggestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int size = scanner.nextInt();

        int[] a = new int[size];
        for (int i = 0; i < size; i++){
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }


        int max = a[0];
        for (int i = 1; i < size - 1; i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        System.out.println();
        System.out.println(max);
    }
}
