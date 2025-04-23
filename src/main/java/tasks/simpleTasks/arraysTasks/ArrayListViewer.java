package tasks.simpleTasks.arraysTasks;

import java.util.List;

public class ArrayListViewer {

    public static void whileArray(List<String> someList) {
        System.out.println("while (условие)");
        int i = 0;
        while (i < someList.size()) {
            System.out.println(someList.get(i));
            i++;
        }
    }

    public static void forArray(List<String> someList) {
        System.out.println("for (инициализация;список)");
        for (String s : someList) {
            System.out.println(s);
        }
    }
}