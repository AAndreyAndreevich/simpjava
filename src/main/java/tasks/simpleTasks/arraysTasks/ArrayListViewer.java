package tasks.simpleTasks.arraysTasks;

import java.util.List;

public class ArrayListViewer {

    public void whileArray(List<String> someList) {
        System.out.println("while (условие)");
        int i = 0;
        while (i < someList.size()) {
            System.out.println(someList.get(i));
            i++;
        }
    }

    public void forArray(List<String> someList) {
        System.out.println("for (инициализация;список)");
        for (String s : someList) {
            System.out.println(s);
        }
    }
}