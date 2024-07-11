package tasks.patterns.structural;

public class DecoratorApp {

    public static void main(String[] args) {

        ConcreteDecorator concreteDecorator = new ConcreteDecorator(new ConcreteComponent());
        concreteDecorator.superOperation();

    }

    interface Component {
        void operation();
    }

    static class ConcreteComponent implements Component {
        @Override
        public void operation() {
            System.out.println("Concrete Component operation");
        }
    }

    static class Decorator implements Component {

        Component component;
        Decorator(Component component) {
            this.component = component;
        }

        @Override
        public void operation() {
            System.out.println("Decorator operation");
        }
    }

    static class ConcreteDecorator extends Decorator {
        ConcreteDecorator(Component component) {
            super(component);
        }

        public void superOperation() {
            System.out.println("Super operation Concrete Decorator");
        }

        @Override
        public void operation() {
            super.operation();
            superOperation();
        }
    }

}