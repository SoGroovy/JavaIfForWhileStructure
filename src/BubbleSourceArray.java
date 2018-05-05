import java.util.Scanner;

public class BubbleSourceArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value: ");
        int size = scanner.nextInt();

        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int) (Math.random() * 100);

        }
        display(a);
        int swap;
        for(int j = size - 1; j > 0; j-- ){
            for (int i = 0; i < j; i++) {
                if (a[i] > a[i + 1]) {
                    swap = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = swap;
                }
            }
        }
        display(a);
    }

    public static void display(int[] a) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
