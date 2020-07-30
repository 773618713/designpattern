package com.scy.designpattern.behavioral.observer;

/**
 * 观察者抽象类
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
