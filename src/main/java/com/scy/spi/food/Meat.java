package com.scy.spi.food;

public class Meat implements Ifood{
    public String name = "meat";

    @Override
    public String getFood() {
        return name;
    }
}
