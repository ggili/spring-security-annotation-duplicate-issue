package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Service1 implements Specific1 {
    @Override
    public void doSomethig() {
        System.out.println("Do Something1.");
    }
}
