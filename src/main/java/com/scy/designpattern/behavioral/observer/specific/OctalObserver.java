package com.scy.designpattern.behavioral.observer.specific;

import com.scy.designpattern.behavioral.observer.Observer;
import com.scy.designpattern.behavioral.observer.Subject;

/**
 * 八进制观察者
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "转化为八进制: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
