package patterns.behavioral;

public class StateApp {

    public static void main(String[] args) {
        Context context = new Context();
        context.publish();
        context.publish();
        context.publish();
    }

    static class Context {
        private State state;

        public void setState(State state) {
            this.state = state;
        }

        public Context() {
            this.state = new Draft();
            System.out.println("Create Article...");
        }

        public void publish() {
            state.changeState(this);
        }
    }

    interface State {
        void changeState(Context context);
    }

    static class Draft implements State {
        @Override
        public void changeState(Context context) {
            context.setState(new Moderation());
            System.out.println("Draft State: Article waiting for moderation...");
        }
    }

    static class Moderation implements State {
        @Override
        public void changeState(Context context) {
            context.setState(new Publication());
            System.out.println("Moderation State: Publishing Article...");
        }
    }

    static class Publication implements State {
        @Override
        public void changeState(Context context) {
            System.out.println("Publication State: Nothing happens...");
        }
    }
}