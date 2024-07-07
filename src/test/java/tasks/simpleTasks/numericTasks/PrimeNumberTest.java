package tasks.simpleTasks.numericTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeNumberTest {

    @Test
    void yesOrNo() {
        //false проверка
        final boolean resultNo = PrimeNumber.yesOrNo(10);
        Assertions.assertFalse(resultNo);
        //true проверка
        final boolean resultYes = PrimeNumber.yesOrNo(2);
        Assertions.assertTrue(resultYes);
    }
}