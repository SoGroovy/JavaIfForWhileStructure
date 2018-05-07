import java.util.Scanner;

public class SecondBiggestInt {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input value here: ");
//        int size = scanner.nextInt();

        int[] a = new int[]{9, 9, 9, 8, 1, 2, 0, 1};
//        int start = -1;
//        for (int i = 0; i < 6; i++) {
//            a[i] = start;
//            System.out.print(a[i] + " ");
//            start--;
//        }
        System.out.println();
        System.out.println("The second largest number in the array is: " + secondLargest(a));
    }

    public static int secondLargest(int[] a) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
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
