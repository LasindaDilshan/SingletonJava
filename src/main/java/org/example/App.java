package org.example;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {


        SingletonDesignPatternClonable instance1 = SingletonDesignPatternClonable.GetSingletanInstance();
        SingletonDesignPatternClonable instance2 = (SingletonDesignPatternClonable) instance1.clone();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        SingletonDesignPatternReflection instance3 ;

        Constructor[] constructors = SingletonDesignPatternReflection.class.getDeclaredConstructors();

        for( Constructor constructor : constructors )
        {
            constructor.setAccessible(true);
            instance3 = (SingletonDesignPatternReflection) constructor.newInstance();
            System.out.println(instance3.hashCode());

        }
        SingletonDesignPatternSerilizable instance4 = SingletonDesignPatternSerilizable.GetInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance4);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonDesignPatternSerilizable instance5 = (SingletonDesignPatternSerilizable) in.readObject();
        in.close();
        System.out.println(instance4.hashCode());
        System.out.println(instance5.hashCode());



    }


}





