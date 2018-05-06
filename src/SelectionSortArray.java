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
        for(int j = size; j > 0; j--) {
            swapLarge(a, j);
        }
        display(a);
//        display(a);
//        for (int workingSize = size; workingSize > 0; workingSize-- ) {
//            int bigPos = 0;
//            for (int i = 1; i < a.length; i++) {
//                if (a[bigPos] < a[i]) {
//                    bigPos = i;
//                }
//            }
//            int last = a[bigPos];
//            a[bigPos] = a[size - 1];
//            a[size - 1] = last;
//        }
//        display(a);

    }

    public static void display(int[] a) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void swapLarge(int[] a, int b){
        int swap;
        int indexOfMax = 0;
        for (int i = 1; i < b; i++){
            if(a[indexOfMax] < a[i]){
                indexOfMax = i;
            }
        }
        swap = a[indexOfMax];
        a[indexOfMax] = a[b-1];
        a[b-1] = swap;
    }
}
