package patterns.behavioral;

import java.util.Date;

public class MementoApp {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setNameAndDate("Name One");
        System.out.println(originator);

        caretaker.setBackup(originator.createSnapshot());
        originator.setNameAndDate("One");
        System.out.println(originator);

        originator.loadSnapshot(caretaker.getBackup());
        System.out.println(originator);

    }

    static class Originator {

        private String name;
        private Date date;

        public void setNameAndDate(String name) {
            this.name = name;
            this.date = new Date();
        }

        public String toString() {
            return "name : " + name + ", date : " + date;
        }

        public Memento createSnapshot() {
            return new Memento(name);
        }

        public void loadSnapshot(Memento memento) {
            this.name = memento.getName();
            this.date = memento.getDate();
        }
    }

    static class Memento {

        private final String name;
        private final Date date;

        public Memento(String name) {
            this.name = name;
            this.date = new Date();
        }

        public String getName() {
            return name;
        }

        public Date getDate() {
            return date;
        }
    }

    static class Caretaker {

        Memento backup;

        public Memento getBackup() {
            return backup;
        }

        public void setBackup(Memento backup) {
            this.backup = backup;
        }
    }

}