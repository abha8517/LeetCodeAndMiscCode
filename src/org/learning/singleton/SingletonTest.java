package org.learning.singleton;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingletonTest {
    public static void main(String[] args) {
        /*Singleton s = Singleton.getInstance();
        s.setData(55);
        System.out.println("First Reference :: " + s);
        System.out.println("Singleton data value is :: " + s.getData());

        s = null;
        s = Singleton.getInstance();
        System.out.println("Second Reference :: " + s);
        System.out.println("Singleton data value is :: " + s.getData());*/

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;
        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor constructor: constructors) {
                constructor.setAccessible(true);
                instance2 = (Singleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("instance1.hashCode():- "
                + instance1.hashCode());
        System.out.println("instance2.hashCode():- "
                + instance2.hashCode());

        List<Integer> stack  = new ArrayList<>();

        stack.get(0);


    }
}
