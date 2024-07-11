package tasks.patterns.structural;

public class FacadeApp {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.getAll(1, "one");
    }

    static class Facade {
        SomeNumber someNumber = new SomeNumber();
        SomeName someName = new SomeName();

        public void getAll(int number, String name) {
            someNumber.getNumber(number);
            someName.getName(name);
        }
    }

    static class SomeNumber {
        public void getNumber(int number) {
            System.out.println("Число " + number);
        }
    }

    static class SomeName {
        public void getName(String name) {
            System.out.println("Имя " + name);
        }
    }
}