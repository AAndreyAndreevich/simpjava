package tasks.simpleTasks.numericTasks;

public class PrimeNumber {

    public static boolean yesOrNo(int i) {
        if (i == 2) {
            System.out.println("да, " + i + " простое");
            return true;
        }
        if (i%2!=0) {
            System.out.println("да, " + i + " простое");
            return true;
        }
        System.out.println("нет, " + i + " не простое");
        return false;
    }
}