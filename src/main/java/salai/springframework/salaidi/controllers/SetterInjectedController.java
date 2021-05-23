package salai.springframework.salaidi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import salai.springframework.salaidi.services.GreetingService;

/*
This method is calling from under Service/ interface => Implementation
Controller another method with setter Injection
 */

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired // In this method you can place at b4 constructor
     public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public  String getGreetingENG(){
         return greetingService.sayGreetingENG();
    }
}
