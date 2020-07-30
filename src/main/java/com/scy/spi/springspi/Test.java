package com.scy.spi.springspi;

import com.scy.spi.IEat;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<IEat> iEats = SpringFactoriesLoader.loadFactories(IEat.class, null);
        iEats.forEach(iEat -> {
            iEat.eat();
        });
    }
}
