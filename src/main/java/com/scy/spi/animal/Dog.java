package com.scy.spi.animal;

import com.scy.spi.IEat;
import com.scy.spi.food.Ifood;
import org.springframework.beans.factory.annotation.Autowired;

public class Dog implements IEat {

    @Autowired
    Ifood ifood;

    @Override
    public void eat() {
        String food = "";
        if (ifood != null){
            food = ifood.getFood();
        }
        System.out.println("eat" + food);
    }
}
