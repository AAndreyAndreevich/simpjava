package tasks.simpleTasks.arraysTasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ArrayListViewerTest {

    static final List<String> testList = new ArrayList<>();

    static {
        testList.add("Ноль");
        testList.add("Один");
        testList.add("Два");
        testList.add("Три");
        testList.add("Четыре");
    }

    //пока не придумал как это проверять, сейчас показывает что принимает списки и отображает их

    @Test
    void forIArray() {
        ArrayListViewer.forIArray(testList);
    }

    @Test
    void whileArray() {
        ArrayListViewer.whileArray(testList);
    }

    @Test
    void forArray() {
        ArrayListViewer.forArray(testList);
    }
}