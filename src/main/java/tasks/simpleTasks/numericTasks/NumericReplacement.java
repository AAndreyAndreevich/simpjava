package tasks.simpleTasks.numericTasks;

public class NumericReplacement {

    //с третьей переменной
    public static String replace(int a, int b) {
        int c = a;
        a = b;
        b = c;
        return a + " " + b;
    }

    //без третьей
    public static String replace2(int a, int b) {
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        return a + " " + b;
    }

}