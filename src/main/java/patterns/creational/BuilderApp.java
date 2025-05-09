package patterns.creational;

public class BuilderApp {

    public static void main(String[] args) {
        ProductDirector productDirector = new ProductDirector();

        productDirector.setProductBuilder(new ConcreteProduct1());
        Product product = productDirector.buildProduct();
        System.out.println(product);

        productDirector.setProductBuilder(new ConcreteProduct2());
        product = productDirector.buildProduct();
        System.out.println(product);
    }

    static class ProductDirector {
        ProductBuilder productBuilder;

        public void setProductBuilder(ProductBuilder productBuilder) {
            this.productBuilder = productBuilder;
        }

        Product buildProduct() {
            productBuilder.createProduct();
            productBuilder.buildId();
            productBuilder.buildName();
            return productBuilder.getProduct();
        }
    }

    static class ConcreteProduct1 extends ProductBuilder {
        @Override
        void buildId() {
            product.setNumber(0L);
        }

        @Override
        void buildName() {
            product.setName("Ноль");
        }
    }

    static class ConcreteProduct2 extends ProductBuilder {
        @Override
        void buildId() {
            product.setNumber(1L);
        }

        @Override
        void buildName() {
            product.setName("Один");
        }
    }

    static abstract class ProductBuilder {
        Product product;

        void createProduct() {
            product = new Product();
        }

        abstract void buildId();
        abstract void buildName();

        Product getProduct() {
            return product;
        }
    }

    static class Product {
        private Long number;
        private String name;

        public void setNumber(Long number) {
            this.number = number;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + number +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}