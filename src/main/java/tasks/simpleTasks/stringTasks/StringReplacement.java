package tasks.simpleTasks.stringTasks;

public class StringReplacement {

    public static String replacement(String text1, String text2) {
        String text3 = text1;
        text1 = text2;
        text2 = text3;
        return text1 + " " + text2;
    }

}