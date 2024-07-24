package patterns.behavioral;

public class TemplateMethodApp {

    public static void main(String[] args) {
        DocWork docWork = new CSV();
        docWork.handleDoc();
        System.out.println("===");
        docWork = new PDF();
        docWork.handleDoc();
    }

    static abstract class DocWork {

        public void handleDoc() {
            loadDoc();
            rework();
            exit();
        }

        void loadDoc() {
            System.out.println("Document loading");
        }

        abstract void rework();
        abstract void exit();

    }

    static class PDF extends DocWork {

        @Override
        void rework() {
            System.out.println("Обработка PDF");
        }

        @Override
        void exit() {
            System.out.println("Конец PDF");
        }
    }

    static class CSV extends DocWork {
        @Override
        void rework() {
            System.out.println("Обработка CSV");
        }

        @Override
        void exit() {
            System.out.println("Конец CSV");
        }
    }

}