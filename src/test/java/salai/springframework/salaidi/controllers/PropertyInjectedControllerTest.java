package salai.springframework.salaidi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import salai.springframework.salaidi.services.ConstructorGreetingServiceSpecImpl;
import salai.springframework.salaidi.services.GreetingServiceImpl;
import salai.springframework.salaidi.services.PropertyInjectedGreetingServiceSpecImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController ();
        controller.greetingService = new GreetingServiceImpl();
        controller.greetingServiceForSpecific = new PropertyInjectedGreetingServiceSpecImpl();

    }
//    @BeforeEach
//    void setUp(){
//        controller = new PropertyInjectedController();
//        controller.greetingServiceForSpecific = new PropertyInjectedGreetingServiceSpecImpl();
//    }

    @Test
    void getGreetingFR() {
        System.out.println(controller.getGreetingFR());
    }
    @Test
    void getGreetingPro() {
        System.out.println(controller.getGreetingPro());
    }
}