package salai.springframework.salaidi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import salai.springframework.salaidi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;


    @BeforeEach
    void setUp() {

        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreetingNL() {
        System.out.println(controller.getGreetingNL());
    }
}