package tasks.simpleTasks.numericTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumericReplacementTest {

    //оба теста завершаются успешно

    @Test
    void replace() {
        final String result = NumericReplacement.replace(1, 2);
        Assertions.assertEquals("2 1", result);
    }

    @Test
    void replace2() {
        final String result = NumericReplacement.replace2(1, 2);
        Assertions.assertEquals("2 1", result);
    }
}