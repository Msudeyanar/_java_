package test;
import java.util.Scanner;
public class Exercise42 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
     
        boolean result = isAlphabetic(ch);
        
        System.out.println(result);
        
        scanner.close();
    }

    public static boolean isAlphabetic(char c) {

        return Character.isLetter(c);
	}

}
