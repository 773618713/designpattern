package org.foo.demo.animal;

import org.foo.demo.IShout;

public class Dog implements IShout {
    @Override
    public void shout() {
        System.out.println("wang wang");
    }
}
