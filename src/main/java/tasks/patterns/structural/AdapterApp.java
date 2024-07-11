package tasks.patterns.structural;

public class AdapterApp {

    public static void main(String[] args) {
        OldInterface oldInterface = new Adapter();
        oldInterface.print();
    }

    interface OldInterface {
        void print();
    }

    interface NewInterface {
        void printPrint();
    }

    static class Service implements NewInterface {
        @Override
        public void printPrint() {
            System.out.println("Service message");
        }
    }

    static class Adapter extends Service implements OldInterface {
        @Override
        public void print() {
            printPrint();
        }
    }

}