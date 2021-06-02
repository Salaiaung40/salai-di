package salai.springframework.salaidi.controllers;

/*
This method is calling from under Service/ interface => Implementation
Controller another method with Constructor Injection
The best method to implement the controller
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import salai.springframework.salaidi.services.GreetingService;
import salai.springframework.salaidi.services.GreetingServiceForSpecific;

@Controller
public class ConstructorInjectedController {


    private final GreetingServiceForSpecific greetingServiceForSpecific;
    private  final GreetingService greetingService;


//    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceSpecImpl")
//                                             GreetingServiceForSpecific greetingServiceForSpecific) {
//        this.greetingServiceForSpecific= greetingServiceForSpecific;
//        greetingService = null;
//    }
//
//    public ConstructorInjectedController() {
//
//    }

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService,
                                         @Qualifier("constructorGreetingServiceSpecImpl")
                                                 GreetingServiceForSpecific greetingServiceForSpecific) {

        this.greetingService = greetingService;
        this.greetingServiceForSpecific = greetingServiceForSpecific;
    }

    public String getGreetingNL() {
        return greetingService.sayGreetingNL();
    }


    public String getGreeting(){
        return greetingServiceForSpecific.sayGreeting();
    }


}
