package com.question_one;

public class Singleton {
    private static Singleton instance;
    private String properties;
    private Singleton() {
        properties="Connection is established";
    }
    
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }  
    public String getProperty(String key) {
        return properties;
    }
}





