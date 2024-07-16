package tasks.patterns.behavioral;

public class CommandApp {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(
                new AdditionCommand(receiver), new SubstractionCommand(receiver)
        );
        invoker.getSum(1, 2);
        invoker.getDifference(3, 4);
    }

    static class Receiver {
        public void addition(int a, int b) {
            System.out.println(a + b);
        }
        public void substraction(int a, int b) {
            System.out.println(a - b);
        }
    }

    interface Command {
        void execute(int a, int b);
    }

    static class AdditionCommand implements Command {

        private Receiver receiver;

        public AdditionCommand(Receiver receiver) {
            this.receiver = receiver;
        }

        @Override
        public void execute(int a, int b) {
            receiver.addition(a, b);
        }
    }

    static class SubstractionCommand implements Command {

        private Receiver receiver;

        public SubstractionCommand(Receiver receiver) {
            this.receiver = receiver;
        }

        @Override
        public void execute(int a, int b) {
            receiver.substraction(a, b);
        }
    }

    static class Invoker {
        private Command addition;
        private Command substraction;

        public Invoker(Command addition, Command substraction) {
            this.addition = addition;
            this.substraction = substraction;
        }

        public void getSum(int a, int b) {
            addition.execute(a, b);
        }

        public void getDifference(int a, int b) {
            substraction.execute(a, b);
        }
    }
}