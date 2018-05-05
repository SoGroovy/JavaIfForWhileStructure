import java.util.Scanner;

public class MyProj {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input string here to check for palindrome: ");
        String original = in.nextLine();

        if (isPalindrome(original)){
            System.out.println("The input string " + original + " is a palindrome.");
        } else {
            System.out.println("The input string " + original + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String original){
        String reverse = new StringBuilder(original).reverse().toString();
        return original.equals(reverse);
    }
}
