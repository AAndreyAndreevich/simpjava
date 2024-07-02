package tasks.simpleTasks.numericTasks;

public class NumericReplacement {

    //с третьей переменной
    public static void replace(int a, int b, int c) {
        System.out.println(a + " " + b + " " + c);
        a = c;
        b = c;
        System.out.println(a + " " + b + " " + c);
    }

    //без третьей
    public static void replace2(int a, int b) {
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

}