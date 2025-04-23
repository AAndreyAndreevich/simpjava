package tasks.simpleTasks.numericTasks;

public class NumberOfStepsToReduceANumberToZero {

    public static void main(String[] args) {
        numberOfSteps(9);
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        int tempNum = num;
        while (num > 0) {
            count++;
            if (num % 2 == 0) {
                tempNum /= 2;
                System.out.printf("Шаг %d) %d четное; делим на 2 и получаем %d\n", count, num, tempNum);
                num = tempNum;
            } else {
                tempNum -= 1;
                System.out.printf("Шаг %d) %d не четное; отнимаем 1 и получаем %d\n", count, num, tempNum);
                num = tempNum;
            }
        }
        return count;
    }

}