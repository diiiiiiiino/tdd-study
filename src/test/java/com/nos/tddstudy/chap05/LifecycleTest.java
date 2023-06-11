package com.nos.tddstudy.chap05;

import org.junit.jupiter.api.*;

public class LifecycleTest {

    @BeforeAll
    static void totalSetUp(){
        System.out.println("total setUp");
    }
    
    public LifecycleTest(){
        System.out.println("new LifecycleTest");
    }

    @BeforeEach
    void setUp(){
        System.out.println("setUp");
    }

    @Test
    void a(){
        System.out.println("A");
    }

    @Test
    void b(){
        System.out.println("B");
    }

    @AfterEach
    void tearDown(){
        System.out.println("tearDown");
    }

    @AfterAll
    static void totalTearDown(){
        System.out.println("total tearDown");
    }
}
