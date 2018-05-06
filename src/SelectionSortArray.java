import java.util.Scanner;

public class SelectionSortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value: ");
        int size = scanner.nextInt();

        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        display(a);
//        for (int j = size - 1; j > 0; j--) {
//            int index = j;
//            for (int i = 0; i < size - 1 ; i++) {
//                if (a[i] > a[index]) {
//                    int biggerNumber = a[i];
//                    a[i] = a[index];
//                    a[index] = biggerNumber;
//                }
//            }
//            display(a);
//        }
        int bigPos = 0;
        for (int j = size - 1; j > 0; j--) {
            for (int i = 1; i < size; i++) {
                if (a[bigPos] < a[i]) {
                    bigPos = i;

                }
                int last = a[bigPos];
                a[bigPos] = a[j];
                a[j] = last;
            }
        }
//        System.out.println("The index with the biggest value is: " + bigPos);
    }

    public static void display(int[] a) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
