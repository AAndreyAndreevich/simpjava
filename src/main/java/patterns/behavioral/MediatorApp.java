package patterns.behavioral;

public class MediatorApp {

    public static void main(String[] args) {
        Admin admin = new Admin();
        Editor editor = new Editor();
        ConcreteMediator mediator = new ConcreteMediator(admin, editor);

        System.out.println("\nAdmin send message: Hello");
        admin.send("Hello I'm admin");
        System.out.println("\nEditor send message: Hello");
        editor.send("Hello I'm editor");
    }

    interface Mediator {
        void sendMessage(String message, Colleague colleague);
    }

    static class ConcreteMediator implements Mediator {

        private Admin admin;
        private Editor editor;

        public ConcreteMediator(Admin admin, Editor editor) {
            this.admin = admin;
            this.editor = editor;
            admin.setMediator(this);
            editor.setMediator(this);
        }

        @Override
        public void sendMessage(String message, Colleague colleague) {
            if (colleague.equals(admin)) {
                editor.getMessage(message);
            } else if (colleague.equals(editor)) {
                admin.getMessage(message);
            }
        }
    }

    static abstract class Colleague {

        private Mediator mediator;

        public void setMediator(Mediator mediator) {
            this.mediator = mediator;
        }

        void send(String message) {
            mediator.sendMessage(message, this);
        }

        abstract void getMessage(String message);
    }

    static class Admin extends Colleague {

        @Override
        void getMessage(String message) {
            System.out.println("Admin get message: " + message);
        }
    }

    static class Editor extends Colleague {

        @Override
        void getMessage(String message) {
            System.out.println("Editor get message: " + message);
        }
    }
}