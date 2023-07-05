package org.example;

public class SingletonDesignPatternClonable extends CloneSingleton {
    public static SingletonDesignPatternClonable instance;
    private SingletonDesignPatternClonable()
    {}
    // Prevent to being clonable
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public  static SingletonDesignPatternClonable GetSingletanInstance()
    {
        if(instance==null) {
            synchronized (SingletonDesignPatternClonable.class) {
                if(instance==null) {
                    instance = new SingletonDesignPatternClonable();
                }
            }
        }
        return instance;
    }
}
