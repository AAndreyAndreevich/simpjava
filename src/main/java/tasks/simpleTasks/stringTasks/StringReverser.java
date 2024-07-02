package tasks.simpleTasks.stringTasks;

public class StringReverser {

    //со стрингбилдером
    public static StringBuilder reverseByBuilder(String text) {
        return new StringBuilder(text).reverse();
    }
    //без него
    public static String reverser(String text) {
        String reverseText = "";
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            reverseText = symbol + reverseText;
        }
        return reverseText;
    }
}