package salai.springframework.salaidi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import salai.springframework.salaidi.services.GreetingService;
import salai.springframework.salaidi.services.GreetingServiceForSpecific;

/*
This method is calling from under Service/ interface => Implementation
Controller another method with setter Injection
 */

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;
    private GreetingServiceForSpecific greetingServiceForSpecific;


    @Autowired // In this method you can place at b4 constructor
     public void setGreetingService(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Autowired // In this method you can place at b4 constructor
     public void setGreetingServiceForSpecific(@Qualifier ("setterInjectedGreetingServiceSpecImpl")
                                            GreetingServiceForSpecific greetingServiceForSpecific) {

        this.greetingServiceForSpecific = greetingServiceForSpecific;
    }


    public  String getGreetingENG(){
         return greetingService.sayGreetingENG();
    }

    public  String getGreetingSetter(){
         return greetingServiceForSpecific.sayGreeting();
    }
}
