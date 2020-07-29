package org.foo.demo.animal;

import org.foo.demo.IShout;

public class Cat implements IShout {
    @Override
    public void shout() {
        System.out.println("miao miao");
    }
}
