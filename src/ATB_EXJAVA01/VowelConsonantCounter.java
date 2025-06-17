package ATB_EXJAVA01;

import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }

        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
        input.close();
    }
}