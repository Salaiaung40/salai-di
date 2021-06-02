package salai.springframework.salaidi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import salai.springframework.salaidi.services.GreetingServiceImpl;
import salai.springframework.salaidi.services.SetterInjectedGreetingServiceSpecImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
        controller.setGreetingServiceForSpecific (new SetterInjectedGreetingServiceSpecImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreetingENG());
    }
    @Test
    void getGreetingSett() {
        System.out.println(controller.getGreetingSetter());
    }
}