package com.scy.designpattern.behavioral.observer.specific;

import com.scy.designpattern.behavioral.observer.Observer;
import com.scy.designpattern.behavioral.observer.Subject;

/**
 * 二进制观察者
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "转换为二进制: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
