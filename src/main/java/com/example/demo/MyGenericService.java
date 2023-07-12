package com.example.demo;

import jakarta.annotation.security.RolesAllowed;

public interface MyGenericService {
    @RolesAllowed("ABC")
    void doSomethig();
}
