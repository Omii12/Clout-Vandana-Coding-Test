import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String firstString = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String secondString = scanner.nextLine();
        
        scanner.close();
        
        if (areAnagrams(firstString, secondString)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }
}
