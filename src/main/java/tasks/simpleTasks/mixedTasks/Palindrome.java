package tasks.simpleTasks.mixedTasks;

public class Palindrome {

    public static boolean stringPalindrome(String text) {
        String reverseText = "";
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            reverseText = symbol + reverseText;
        }
        if (text.equals(reverseText)) {
            System.out.println("да, палиндром");
            return true;
        } else {
            System.out.println("нет, не палиндром");
            return false;
        }
    }

    public static boolean numericPalindrome(int number) {
        String numToStr = String.valueOf(number);
        String reverseText = "";
        for (int i = 0; i < numToStr.length(); i++) {
            char symbol = numToStr.charAt(i);
            reverseText = symbol + reverseText;
        }
        if (numToStr.equals(reverseText)) {
            System.out.println("да, палиндром");
            return true;
        } else {
            System.out.println("нет, не палиндром");
            return false;
        }
    }
}