package tasks.simpleTasks.mixedTasks;

public class Palindrome {

    /***
     * определяет является строка или число палиндормом
     */

    public static boolean stringPalindrome(String text) {
        StringBuilder reverseText = new StringBuilder();
        for (Character s : text.toCharArray()) {
            reverseText.insert(0, s);
        }
        return reverseText.equals(text);
    }

    public static boolean numericPalindrome(int number) {
        StringBuilder reverseNumber = new StringBuilder();
        for (Character s : String.valueOf(number).toCharArray()) {
            reverseNumber.insert(0, s);
        }
        return reverseNumber.toString().equals(String.valueOf(number));
    }
}