package com.scy.spi.javaspi;

import com.scy.spi.IEat;
import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 参考
 * https://www.jianshu.com/p/46b42f7f593c
 */
public class TestMain {
    public static void main(String[] args) {
        // 方式1：通过 Service.providers 获取实现类的实例
        Iterator<IEat> providers = Service.providers(IEat.class);
        while (providers.hasNext()) {
            IEat iEat = providers.next();
            iEat.eat();
        }

        // 方式2：通过 ServiceLoader.load 获取
        ServiceLoader<IEat> iEats = ServiceLoader.load(IEat.class);
        for (IEat s : iEats) {
            s.eat();
        }

    }
}
