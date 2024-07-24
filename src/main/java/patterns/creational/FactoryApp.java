package patterns.creational;

public class FactoryApp {

    public static void main(String[] args) {
        CreatorProduct creator = createProduct(1);
        Product product = creator.newProduct();
        product.someMethod();
    }

    interface Product {
        void someMethod();
    }

    static class ConcreteProduct1 implements Product {
        @Override
        public void someMethod() {
            System.out.println("method Concrete Product 1");
        }
    }

    static class ConcreteProduct2 implements Product {
        @Override
        public void someMethod() {
            System.out.println("method Concrete Product 2");
        }
    }

    interface CreatorProduct {
        Product newProduct();
    }

    static class CreatorConcreteProduct1 implements CreatorProduct {
        @Override
        public Product newProduct() {
            return new ConcreteProduct1();
        }
    }

    static class CreatorConcreteProduct2 implements CreatorProduct {
        @Override
        public Product newProduct() {
            return new ConcreteProduct2();
        }
    }

    static CreatorProduct createProduct(int option) {
        switch (option) {
            case 1 : return new CreatorConcreteProduct1();
            case 2 : return new CreatorConcreteProduct2();
            default : throw new RuntimeException("");
        }
    }
}