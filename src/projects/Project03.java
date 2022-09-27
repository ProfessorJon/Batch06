package projects;

import utilities.CharHelper;
import utilities.NumHelper;

public class Project03 {
    public static void main(String[] args) {
        System.out.println("TASK 1");
        String s1 = "24", s2 = "5";

        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
        System.out.println(Integer.parseInt(s1) - Integer.parseInt(s2));
        System.out.println(Double.parseDouble(s1) / Integer.parseInt(s2));
        System.out.println(Integer.parseInt(s1) * Integer.parseInt(s2));
        System.out.println(Integer.parseInt(s1) % Integer.parseInt(s2));

        System.out.println("\nTASK 2");
        int randNum = 1 + (int) (Math.random() * 10);
        System.out.println();
        if (NumHelper.isPrime(randNum)) System.out.println(randNum + " IS A PRIME NUMBER");
        else System.out.println(randNum + " IS NOT A PRIME NUMBER");

        System.out.println("\nTASK 3");

        int randNum1 = 1 + (int) (Math.random() * 50);
        int randNum2 = 1 + (int) (Math.random() * 50);
        int randNum3 = 1 + (int) (Math.random() * 50);

        int lowest = Math.min(Math.min(randNum1, randNum2), randNum3);
        int greatest = Math.max(Math.max(randNum1, randNum2), randNum3);
        int middle = 0;
        if (lowest == randNum1) {
            middle = Math.min(randNum2, randNum3);
        } else if (lowest == randNum2) {
            middle = Math.min(randNum1, randNum3);
        } else middle = Math.min(randNum1, randNum2);

        System.out.println("Lowest number is = " + lowest);
        System.out.println("Middle number is = " + middle);
        System.out.println("Greatest number is = " + greatest);
        System.out.println();

        System.out.println("\nTASK 4");
        char c1 = '5';
        char c2 = 'a';
        char c3 = 'R';

        CharHelper.printLowerOrUpper(c1);
        CharHelper.printLowerOrUpper(c2);
        CharHelper.printLowerOrUpper(c3);

        System.out.println("\nTASK 5");
        char c4 = '#';
        char c5 = 'e';
        char c6 = 'R';

        CharHelper.printVowelOrConsonant(c4);
        CharHelper.printVowelOrConsonant(c5);
        CharHelper.printVowelOrConsonant(c6);

        System.out.println("\nTASK 6");
        char c7 = '8';
        char c8 = '*';

        CharHelper.printSpecialOrNot(c7);
        CharHelper.printSpecialOrNot(c8);

        System.out.println("\nTASK 7");
        char c9 = 'g';
        char c10 = '5';
        char c11 = '@';

        CharHelper.printCharacterType(c9);
        CharHelper.printCharacterType(c10);
        CharHelper.printCharacterType(c11);
    }
}
