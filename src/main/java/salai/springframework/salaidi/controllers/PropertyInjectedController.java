package salai.springframework.salaidi.controllers;

import salai.springframework.salaidi.services.GreetingService;

/*
This method is calling from under Service/ interface => Implementation
Controller another method with Property Injection
 */

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreetingFR(){
        return greetingService.sayGreetingFR();
    }
}
