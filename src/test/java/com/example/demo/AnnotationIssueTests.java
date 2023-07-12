package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;

@SpringBootTest
class AnnotationIssueTests {

    @Autowired
    private Service1 service1;


    @Test
    @WithMockUser(roles = "ABC")
    void contextLoads() {
        service1.doSomethig();
    }

}
