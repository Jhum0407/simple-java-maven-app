package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";
    private final String secondMessage="Goodbye World";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

     final String getMessage() {
        return message;
    }
     final String getSecMessage() {
        return secondMessage;
    }

}
