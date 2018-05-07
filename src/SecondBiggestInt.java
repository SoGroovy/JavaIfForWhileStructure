import java.util.Scanner;

public class SecondBiggestInt {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input value here: ");
//        int size = scanner.nextInt();

        int[] a = new int[6];
        int start = -1;
        for (int i = 0; i < 6; i++) {
            a[i] = start;
            System.out.print(a[i] + " ");
            start--;
        }
        System.out.println();
        System.out.println("The second largest number in the array is: " + secondLargest(a));
    }

    public static int secondLargest(int[] a) {
            int max = a[0];
            int secondMax =0;
            for (int i = 1; i < a.length; i++) {
                if (max < a[i]) {
                    secondMax = max;
                    max = a[i];
                } else if (a[i] > secondMax && a[i] < max){
                    secondMax = a[i];
                }
            }
            return secondMax;
        }
}
