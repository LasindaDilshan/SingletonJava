package org.example;

import java.io.Serializable;

public class SingletonDesignPatternSerilizable implements Serializable {
    public static SingletonDesignPatternSerilizable instance ;
    private SingletonDesignPatternSerilizable()
    {

    }
    protected Object readResolve()
    {
        return instance;
    }
    public static SingletonDesignPatternSerilizable GetInstance()
    {
        if(instance==null) {
            synchronized (SingletonDesignPatternSerilizable.class) {
                if(instance==null) {
                    instance = new SingletonDesignPatternSerilizable();
                }
            }
        }
        return instance;
    }
}
