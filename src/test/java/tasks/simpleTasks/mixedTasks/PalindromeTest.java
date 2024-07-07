package tasks.simpleTasks.mixedTasks;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class PalindromeTest extends TestCase {

    //тест на true результат
    public void testStringPalindrome() {
        final boolean result = Palindrome.stringPalindrome("anna");
        Assertions.assertTrue(result);
    }

    //тест на false результат
    public void testNumericPalindrome() {
        final boolean result = Palindrome.numericPalindrome(137);
        Assertions.assertFalse(result);
    }
}