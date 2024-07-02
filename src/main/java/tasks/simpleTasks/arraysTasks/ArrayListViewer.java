package tasks.simpleTasks.arraysTasks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListViewer {

    static List<String> someList = new ArrayList<>();
    static {
        someList.add("Ноль");
        someList.add("Один");
        someList.add("Два");
        someList.add("Три");
        someList.add("Четыре");
    }

    public static void forIArray() {
        System.out.println("for (инициализация;условие;итерация)");
        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }
    }

    public static void whileArray() {
        System.out.println("while (условие)");
        int i = 0;
        while (i < someList.size()) {
            System.out.println(someList.get(i));
            i++;
        }
    }

    public static void forArray() {
        System.out.println("for (инициализация;список)");
        for (String s : someList) {
            System.out.println(s);
        }
    }

    public static List<String> getSomeList() {
        return someList;
    }
}