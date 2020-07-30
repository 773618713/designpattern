package com.scy.designpattern.behavioral.observer;

import com.scy.designpattern.behavioral.observer.specific.BinaryObserver;
import com.scy.designpattern.behavioral.observer.specific.HexaObserver;
import com.scy.designpattern.behavioral.observer.specific.OctalObserver;

/**
 * 观察者模式案例测试
 * 当Subject对象中的state数据改变，所有负责进制转换的对象（观察者），要将这个值转换成对应的进制。
 */
public class TestMain {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("第一次数据改变: 15");
        subject.setState(15);
        System.out.println("\r\n第二次数据改变: 10");
        subject.setState(10);
    }
}
