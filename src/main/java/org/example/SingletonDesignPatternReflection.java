package org.example;

public class SingletonDesignPatternReflection {
    public static SingletonDesignPatternReflection instance;
    // prevent when using reflection
    private SingletonDesignPatternReflection()
    {
        if(instance==null)
        {
            throw new IllegalStateException("Object Cant Created using Reflection");
        }
    }
    public  static SingletonDesignPatternReflection GetSingletanInstance()
    {
        if(instance==null) {
            synchronized (SingletonDesignPatternClonable.class) {
                if(instance==null) {
                    instance = new SingletonDesignPatternReflection();
                }
            }
        }
        return instance;
    }
}
