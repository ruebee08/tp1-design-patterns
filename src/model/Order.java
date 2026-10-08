package src.model;

import java.util.ArrayList;
import java.util.List;

import src.observer.Observer;
import src.observer.Subject;

public class Order implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String status = "CREATED";

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getStatus() { return status; }
}
