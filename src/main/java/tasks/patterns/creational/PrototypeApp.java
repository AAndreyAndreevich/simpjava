package tasks.patterns.creational;

public class PrototypeApp {

    public static void main(String[] args) {
        Product product = new Product("one", 1L);
        System.out.println(product);
        Product product1 = (Product) product.getClone();
        System.out.println(product1);
        product.setName("null");
        product.setNumber(0L);
        System.out.println(product);
    }

    interface Prototype {
        Object getClone();
    }

    static class Product implements Prototype {

        private String name;
        private Long number;

        public Product(String name, Long number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getNumber() {
            return number;
        }

        public void setNumber(Long number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", number=" + number +
                    '}';
        }

        @Override
        public Object getClone() {
            return new Product(name, number);
        }
    }

}