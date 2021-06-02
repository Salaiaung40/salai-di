package salai.springframework.salaidi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import salai.springframework.salaidi.services.ConstructorGreetingServiceSpecImpl;
import salai.springframework.salaidi.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;



    @BeforeEach
    void setUp() {

        controller = new ConstructorInjectedController(new GreetingServiceImpl(),
                new ConstructorGreetingServiceSpecImpl());


    }

    @Test
    void getGreetingNL() {
        System.out.println(controller.getGreetingNL());

    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }

}