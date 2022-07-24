package com.example;

import jakarta.inject.Singleton;

@Singleton
public class SecondHelloWorldService implements MyService{

    @Override
    public String helloFromService(){
        return "Hello from Second Service";
    }
}
