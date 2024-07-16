package tasks.patterns.behavioral;

public class IteratorApp {

    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    static class ConcreteAggregate implements Aggregate {

        private String[] patterns = {"Singleton", "Factory", "Interpreter", "Decorator", "Facade", "Prototype"};

        @Override
        public Iterator getIterator() {
            return new PatternsIterator(patterns);
        }
    }

    static class PatternsIterator implements Iterator {

        private final String[] patterns;
        int index = 0;

        PatternsIterator(String[] patterns) {
            this.patterns = patterns;
        }

        @Override
        public boolean hasNext() {
            if (index < patterns.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            return patterns[index++];
        }
    }

    interface Iterator {
        boolean hasNext();
        Object next();
    }

    interface Aggregate {
        Iterator getIterator();
    }

}
