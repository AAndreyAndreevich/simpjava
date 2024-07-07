package tasks.simpleTasks.stringTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringReplacementTest {

    @Test
    void replacement() {
        //меняются значения местами
        final String result = StringReplacement.replacement("один", "два");
        Assertions.assertEquals("два один", result);
    }
}