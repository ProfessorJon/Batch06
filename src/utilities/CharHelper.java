package utilities;

public class CharHelper {

    // Operand differences
    // | (Simple Logical OR) vs || (Short Circuit OR)
    // Simple will check both values which can use up time if the first check is already true
    // Short Circuit will read from left to right and stop at the first instance of true

    // Example:
    // String s = null;
    // System.out.println("a || b = " + s==null || s.length() == 0 ); (true)
    // System.out.println("a | b = " + s==null | s.length() == 0 ); (NullPointerException)
    public static void printLowerOrUpper(char c) {
        if (isLetter(c)) {
            if (isUpper(c)) System.out.println("The letter is uppercase");
            else System.out.println("The letter is lowercase");
        } else System.out.println("Invalid character detected");
    }

    public static void printVowelOrConsonant(char c) {
        if (isLetter(c)) {
            if (isUpper(c)) c += 32; // uppercase letters are lower in ascii value, adding 32 takes it to lowercase
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') System.out.println("The letter is vowel");
            else System.out.println("The letter is consonant");
        } else System.out.println("Invalid character detected");
    }

    public static void printSpecialOrNot(char c) {
        if (isSpecial(c)) System.out.println("Special character is = " + c);
        else System.out.println("Invalid character detected");
    }

    public static void printCharacterType(char c) {
        if (isLetter(c)) System.out.println("Character is a letter");
        else if (isDigit(c)) System.out.println("Character is a digit");
        else System.out.println("Character is a special character");
    }

    public static boolean isSpecial(char c) {
        if (!isDigit(c) && !isLetter(c)) return true;
        return false;
    }

    public static boolean isDigit(char c) {
        if (48 <= c && c <= 57) return true;
        return false;
    }

    public static boolean isLetter(char c) {
        if (isLower(c) || isUpper(c)) return true;
        return false;
    }

    public static boolean isUpper(char c) {
        if (65 <= c && c <= 90) return true;
        return false;
    }

    public static boolean isLower(char c) {
        if (97 <= c && c <= 122) return true;
        return false;
    }
}
