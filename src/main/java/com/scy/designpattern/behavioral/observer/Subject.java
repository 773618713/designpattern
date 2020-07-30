package com.scy.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    //观察者
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    //通知所有观察者
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
