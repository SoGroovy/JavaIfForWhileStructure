import java.util.Scanner;

public class EvenVSOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value: ");
        int size = scanner.nextInt();

        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int) (Math.random() * 100);

        }
        display(a);
        System.out.println("The biggest number within the array is: " + max(a));
        System.out.println("The total amount of even numbers is: " + totalEvenNumber(a));
        System.out.println("The sum of the even numbers is: " + sumEvenNumber(a));
        System.out.println("The sum of th even numbers with the while loop is: " + sumEWhile(a));
    }

    public static void display(int[] a) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int max(int[] a) {
        System.out.println();
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (m < a[i]) {
                m = a[i];
            }
        }
        return m;
    }

    public static int totalEvenNumber(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count = +1;
            }
        }
        return count;
    }
    public static int sumEvenNumber(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                sum = sum + a[i];
            }
        }
        return sum;
    }
    public static int sumEWhile(int[] a){
        int sum = 0;
        int i = 0;
        while(i < a.length){
            if(a[i] % 2 == 0){
                sum = sum + a[i];
            }
            i++;
        }
        return sum;
    }
}
