package salai.springframework.salaidi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import salai.springframework.salaidi.services.GreetingService;

/*
This method is calling from under Service/ interface => Implementation
Controller another method with Property Injection
 */

@Controller
public class PropertyInjectedController {
    @Autowired // this is telling Spring that inject this. In this method Only place at the beginning.
    public GreetingService greetingService;

    public String getGreetingFR(){
        return greetingService.sayGreetingFR();
    }
}
