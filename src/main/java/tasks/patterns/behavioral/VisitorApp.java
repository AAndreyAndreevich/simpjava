package tasks.patterns.behavioral;

public class VisitorApp {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        NumericVisitorX2 numericVisitorX2 = new NumericVisitorX2();
        System.out.println(objectStructure.getSumNumeric(numericVisitorX2));
    }

    interface Element {
        int getNumeric(Visitor visitor);
    }

    static class ConcreteElementA implements Element {
        private int number;

        public ConcreteElementA(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public int getNumeric(Visitor visitor) {
            return visitor.elementANumeric(this);
        }
    }

    static class ConcreteElementB implements Element {
        private int number;

        public ConcreteElementB(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public int getNumeric(Visitor visitor) {
            return visitor.elementBNumeric(this);
        }
    }

    static class ObjectStructure {
        Element[] elements;

        public ObjectStructure() {
            this.elements = new Element[] {
                    new ConcreteElementA(3),
                    new ConcreteElementB(6),
                    new ConcreteElementA(9),
                    new ConcreteElementB(12)
            };
        }

        public int getSumNumeric(Visitor visitor) {
            int sum = 0;
            for (Element element : elements) {
                sum += element.getNumeric(visitor);
            }
            return sum;
        }
    }

    interface Visitor {
        int elementANumeric(ConcreteElementA concreteElementA);
        int elementBNumeric(ConcreteElementB concreteElementB);
    }

    static class NumericVisitorX2 implements Visitor {
        @Override
        public int elementANumeric(ConcreteElementA concreteElementA) {
            int number = concreteElementA.getNumber() * 2;
            System.out.println("Number Element A * 2 = " + number);
            return number;
        }

        @Override
        public int elementBNumeric(ConcreteElementB concreteElementB) {
            int number = concreteElementB.getNumber() * 2;
            System.out.println("Number Element B * 2 = " + number);
            return number;
        }
    }
}