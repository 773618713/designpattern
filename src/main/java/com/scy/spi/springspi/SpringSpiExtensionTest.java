package com.scy.spi.springspi;

import com.scy.spi.IEat;
import com.scy.spi.food.Ifood;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.scy.spi.springspi.extension.ExtensionLoader;

public class SpringSpiExtensionTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        /*Ifood bean = classPathXmlApplicationContext.getBean(Ifood.class);
        System.out.println(bean.getFood());*/

        ExtensionLoader extensionLoader = classPathXmlApplicationContext.getBean(ExtensionLoader.class);

        IEat iEatDog = (IEat) extensionLoader.getExtensions(IEat.class).get("dog");
        iEatDog.eat();

        IEat iEatCat = (IEat) extensionLoader.getExtensions(IEat.class).get("cat");
        iEatCat.eat();
    }
}
