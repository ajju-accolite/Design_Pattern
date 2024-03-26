package com.question_one;

public class Main {
    public static void main(String[] args) {
   
    	Singleton configManager = Singleton.getInstance();
    	
        String dbHost = configManager.getProperty("db.host");
        String dbPort = configManager.getProperty("db.port");

        System.out.println("Database Host: " + dbHost);
        System.out.println("Database Port: " + dbPort);
    }
}




