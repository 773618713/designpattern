package com.scy.designpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 * 	这个类用来演示冲突解决
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public void addUser() {
    }
    
    public void addUserTest() {
    	Map<String, Object> map = new HashMap<>();
    	map.put("a", 1);
    	map.put("y", 2);
    	map.put("z", 3);
    }
}
