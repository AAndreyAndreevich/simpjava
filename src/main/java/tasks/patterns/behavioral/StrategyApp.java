package tasks.patterns.behavioral;

public class StrategyApp {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new FirstStrategy());
        context.executeStrategy("Запускаем стратегию");
        context.setStrategy(new SecondStrategy());
        context.executeStrategy("Запускаем стратегию");
    }

    static class Context {
        private Strategy strategy;

        public void setStrategy(Strategy strategy) {
            this.strategy = strategy;
        }

        void executeStrategy(String string) {
            strategy.run(string);
        }
    }

    interface Strategy {
        void run(String string);
    }

    static class FirstStrategy implements Strategy {
        @Override
        public void run(String string) {
            System.out.println("Первый вариант решения: " + string);
        }
    }

    static class SecondStrategy implements Strategy {
        @Override
        public void run(String string) {
            System.out.println("Второй вариант решения: " + string);
        }
    }

}