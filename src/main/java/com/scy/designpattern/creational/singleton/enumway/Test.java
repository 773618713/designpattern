package com.scy.designpattern.creational.singleton.enumway;

import java.io.*;
import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) {
        try {
            testReflect();
            testSerialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试序列化，能否创建一个新的对象。
     * 结果表明反序列化后的对象和序列化前的对象是同一个对象。
     *
     * @throws Exception
     */
    private static void testSerialize() throws Exception {
        Color c1 = Color.RED;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Color.obj"));
        oos.writeObject(c1);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Color.obj"));
        Color c2 = (Color) ois.readObject();
        ois.close();
        System.out.println(c1 == c2);
    }

    /**
     * 测试能否使用反射再次实例化一个枚举对象
     * 结果表明,枚举无法通过反射进行实例化，会报错：
     * java.lang.IllegalArgumentException: Cannot reflectively create enum objects
     *
     * @throws Exception
     */
    private static void testReflect() throws Exception {
        Constructor constructor = Color.class.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Color color = (Color) constructor.newInstance("READ", 11);
    }
}
