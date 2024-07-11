package tasks.patterns.structural;

import java.util.ArrayList;
import java.util.List;

public class CompositeApp {

    public static void main(String[] args) {

        Leaf one = new Leaf(1, "one");
        Leaf two = new Leaf(2, "two");
        Leaf three = new Leaf(3, "three");

        Composite composite1 = new Composite();

        composite1.add(one);
        composite1.add(two);
        composite1.add(three);
        composite1.getName();
        System.out.println("===");

        composite1.remove(two);
        composite1.getName();

    }

    interface Component {

        void getNumber();
        void getName();

    }

    static class Leaf implements Component{

        private final int number;
        private final String name;

        public Leaf(int number, String name) {
            this.number = number;
            this.name = name;
        }

        @Override
        public void getNumber() {
            System.out.println(number);
        }

        @Override
        public void getName() {
            System.out.println(name);
        }
    }

    static class Composite implements Component {

        List<Component> componentList;

        Composite() {
            componentList = new ArrayList<>();
        }

        void add(Component component) {
            componentList.add(component);
        }

        void remove(Component component) {
            componentList.remove(component);
        }

        @Override
        public void getNumber() {
            for (Component component : componentList) {
                component.getNumber();
            }
        }

        @Override
        public void getName() {
            for (Component component : componentList) {
                component.getName();
            }
        }
    }
}