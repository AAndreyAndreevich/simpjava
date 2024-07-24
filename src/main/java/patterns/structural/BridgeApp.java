package patterns.structural;

public class BridgeApp {

    public static void main(String[] args) {
        Abstraction rfa = new RefinedAbstraction(new ConcreteImplementor2());
        rfa.absMethod();
        rfa.withImpl();
        rfa.setImplementor(new ConcreteImplementor1());
        rfa.absMethod();
        rfa.withImpl();
    }

    interface Implementor {
        void someImplMethod();
    }

    static abstract class Abstraction {
        private Implementor implementor;

        Abstraction(Implementor implementor) {
            this.implementor = implementor;
        }

        public void setImplementor(Implementor implementor) {
            this.implementor = implementor;
        }

        public void withImpl() {
            implementor.someImplMethod();
        }

        abstract void absMethod();
    }

    static class RefinedAbstraction extends Abstraction {

        RefinedAbstraction(Implementor implementor) {
            super(implementor);
        }

        @Override
        void absMethod() {
            System.out.println("Refined message");
        }
    }

    static class ConcreteImplementor1 implements Implementor {
        @Override
        public void someImplMethod() {
            System.out.println("Concrete message 1");
        }
    }

    static class ConcreteImplementor2 implements Implementor {
        @Override
        public void someImplMethod() {
            System.out.println("Concrete message 2");
        }
    }

}