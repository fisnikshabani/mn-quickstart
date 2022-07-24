package com.example;

import jakarta.inject.Singleton;

@Singleton
public class HelloWorldService {

    String helloFromService(){
        return "Hello from Service";
    }
}
