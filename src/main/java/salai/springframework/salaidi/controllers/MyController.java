package salai.springframework.salaidi.controllers;

import org.springframework.stereotype.Controller;
import salai.springframework.salaidi.services.GreetingService;
/*
This is the very simple calling controller method
 */

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

//        System.out.println("Hello World from Salai!!");
//
//        return "Hi Folks!! this is Salai";

        return greetingService.sayGreetingENG();


    }
}
