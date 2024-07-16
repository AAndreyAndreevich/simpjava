package tasks.patterns.behavioral;

public class ChainOfResponsibilityApp {

    public static void main(String[] args) {
        Handler firstHandler = new FirstHandler(Priority.ONE);
        Handler secondHandler = new SecondHandler(Priority.TWO);
        Handler thirdHandler = new ThirdHandler(Priority.THREE);

        firstHandler.setNextHandler(secondHandler);
        secondHandler.setNextHandler(thirdHandler);

        firstHandler.handlerManager("111", Priority.ONE);
        firstHandler.handlerManager("222", Priority.TWO);
        firstHandler.handlerManager("333", Priority.THREE);
    }

    abstract static class Handler {

        private int priority;
        private Handler nextHandler;

        public Handler(int priority) {
            this.priority = priority;
        }

        public void setNextHandler(Handler nextHandler) {
            this.nextHandler = nextHandler;
        }

        public void handlerManager(String message, int condition) {
            if (condition >= priority) {
                write(message);
            }
            if (nextHandler != null) {
                nextHandler.handlerManager(message, condition);
            }
            else {
                System.out.println("\n===============\n");
            }
        }

        public abstract void write(String message);
    }

    static class Priority {
        public static final int ONE = 1;
        public static final int TWO = 2;
        public static final int THREE = 3;
    }

    static class FirstHandler extends Handler {

        public FirstHandler(int priority) {
            super(priority);
        }

        @Override
        public void write(String message) {
            System.out.println("First Handler message");
        }
    }

    static class SecondHandler extends Handler {

        public SecondHandler(int priority) {
            super(priority);
        }

        @Override
        public void write(String message) {
            System.out.println("Second Handler message");
        }
    }

    static class ThirdHandler extends Handler {

        public ThirdHandler(int priority) {
            super(priority);
        }

        @Override
        public void write(String message) {
            System.out.println("Third Handler message");
        }
    }
}