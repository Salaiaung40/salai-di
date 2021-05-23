package salai.springframework.salaidi.controllers;

import salai.springframework.salaidi.services.GreetingService;

/*
This method is calling from under Service/ interface => Implementation
Controller another method with setter Injection
 */
public class SetterInjectedController {
    private GreetingService greetingService;

     public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public  String getGreetingENG(){
         return greetingService.sayGreetingENG();
    }
}
