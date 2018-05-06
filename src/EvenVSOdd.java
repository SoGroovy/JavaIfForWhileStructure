import java.util.Scanner;

public class EvenVSOdd {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value: ");
        int size = scanner.nextInt();

        int[] a = new int[size];
        for (int i = 0; i < size; i++){
            a[i] = (int)(Math.random() * 100);

        }
        display(a);
        System.out.println(max(a));

    }
    public static void display(int [] a){
        System.out.println();
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static int max(int[] a){
        System.out.println();
        int m = a[0];
        for (int i = 1; i < a.length; i++){
            if(m < a[i]){
                m = a[i];
            }
        }
        return m;
    }
}
