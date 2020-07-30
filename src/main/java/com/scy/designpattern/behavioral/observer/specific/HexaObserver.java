package com.scy.designpattern.behavioral.observer.specific;

import com.scy.designpattern.behavioral.observer.Observer;
import com.scy.designpattern.behavioral.observer.Subject;

/**
 * 十六进制观察者
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("转换为十六进制: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
