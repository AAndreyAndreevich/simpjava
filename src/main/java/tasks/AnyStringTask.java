package tasks;

public class AnyStringTask {

    //повторение строчки * количество раз
    public static String repeater(String text, int count) {
        return text.repeat(count);
    }

    //добавление строчки к строкам
    public static String joinIn(String text, String ... addText) {
        return String.join(text, addText);
    }

    //переворачивание строчки
    public static StringBuilder reverser(String text) {
        return new StringBuilder(text).reverse();
    }

    //false если в строчке встречается не число
    public static boolean trueOrFalse(String anyString) {
        for (Character symbol : anyString.toCharArray()) {
            if (!Character.isDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

}