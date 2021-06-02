package salai.springframework.salaidi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import salai.springframework.salaidi.services.GreetingService;
import salai.springframework.salaidi.services.GreetingServiceForSpecific;

/*
This method is calling from under Service/ interface => Implementation
Controller another method with Property Injection
 */

@Controller
public class PropertyInjectedController {


    @Autowired // this is telling Spring that inject this. In this method Only place at the beginning.
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;

    @Autowired
    @Qualifier ("propertyInjectedGreetingServiceSpecImpl")
    public GreetingServiceForSpecific greetingServiceForSpecific;

    public String getGreetingFR(){
        return greetingService.sayGreetingFR();
    }

    public String getGreetingPro(){
        return greetingServiceForSpecific.sayGreeting();
    }
}
