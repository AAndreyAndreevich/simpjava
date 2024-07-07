package tasks.simpleTasks.stringTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringReverserTest {

    //оба теста должны завершиться успешно

    @Test
    public void testReverseByBuilder() {
        final String result = String.valueOf(StringReverser.reverseByBuilder("junit test"));
        Assertions.assertEquals("tset tinuj", result);
    }

    @Test
    public void testReverser() {
        final String result = StringReverser.reverser("junit test");
        Assertions.assertEquals("tset tinuj", result);
    }
}