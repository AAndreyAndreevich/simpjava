package patterns.behavioral;

import java.util.ArrayList;
import java.util.List;

public class ObserverApp {

    public static void main(String[] args) {
        NewsSite newsSite = new NewsSite();
        NewsListener listenerOne = new NewsListener("firstListener");
        NewsListener listenerTwo = new NewsListener("secondListener");
        newsSite.addObserver(listenerOne);
        newsSite.addObserver(listenerTwo);
        newsSite.addNews("First news");
        newsSite.addNews("Second news");
        newsSite.removeNews("First news");
    }

    interface Observable {
        void addObserver(Observer observer);
        void removeObserver(Observer observer);
        void notifyObserver();
    }

    interface Observer {
        void handleEvent(List<String> news);
    }

    static class NewsSite implements Observable {
        private List<Observer> listeners = new ArrayList<>();
        private List<String> news = new ArrayList<>();

        @Override
        public void addObserver(Observer observer) {
            listeners.add(observer);
        }

        @Override
        public void removeObserver(Observer observer) {
            listeners.remove(observer);
        }

        @Override
        public void notifyObserver() {
            for (Observer observer : listeners) {
                observer.handleEvent(news);
            }
        }

        public void addNews(String news) {
            this.news.add(news);
        }

        public void removeNews(String news) {
            this.news.remove(news);
            this.notifyObserver();
        }
    }

    static class NewsListener implements Observer {
        private String name;

        public NewsListener(String name) {
            this.name = name;
        }

        @Override
        public void handleEvent(List<String> news) {
            System.out.println("I'm " + name + " I get news");
            System.out.println(news);
        }
    }

}