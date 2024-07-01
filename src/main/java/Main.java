import tasks.AnyStringTask;

public class Main {
    public static void main(String[] args) {
        System.out.println(AnyStringTask.joinIn("!", "один", "два", "три", "четыре", "пять"));
        System.out.println(AnyStringTask.repeater("точно ", 10));
        System.out.println(AnyStringTask.reverser("отунревереп"));
        System.out.println(AnyStringTask.trueOrFalse("888888888888888B88888888888"));
        System.out.println(AnyStringTask.trueOrFalse("888888888888888888888888888"));
    }
}