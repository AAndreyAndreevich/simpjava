package tasks.patterns.creational.abstractPattern;

public class AbstractApp {

    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        Product product = concreteFactory2.createProduct();
        Service service = concreteFactory1.createService();
        product.print();
        service.print();
    }

    interface Product {
        void print();
    }

    static class AbstractProduct1 implements Product {
        @Override
        public void print() {
            System.out.println("Abstract Product 1");
        }
    }

    static class AbstractProduct2 implements Product {
        @Override
        public void print() {
            System.out.println("Abstract Product 2");
        }
    }

    interface Service {
        void print();
    }

    static class AbstractService1 implements Service {
        @Override
        public void print() {
            System.out.println("Abstract Service 1");
        }
    }

    static class AbstractService2 implements Service {
        @Override
        public void print() {
            System.out.println("Abstract Service 2");
        }
    }

    interface AbstractFactory {
        Product createProduct();
        Service createService();
    }

    static class ConcreteFactory1 implements AbstractFactory {
        @Override
        public Product createProduct() {
            return new AbstractProduct1();
        }

        @Override
        public Service createService() {
            return new AbstractService1();
        }
    }

    static class ConcreteFactory2 implements AbstractFactory {
        @Override
        public Product createProduct() {
            return new AbstractProduct2();
        }

        @Override
        public Service createService() {
            return new AbstractService2();
        }
    }
}