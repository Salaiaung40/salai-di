package salai.springframework.salaidi.controllers;

/*
This method is calling from under Service/ interface => Implementation
Controller another method with Constructor Injection
The best method to implement the controller
 */

import salai.springframework.salaidi.services.GreetingService;

public class ConstructorInjectedController {

    private  final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreetingNL(){
        return greetingService.sayGreetingNL();
    }
}
