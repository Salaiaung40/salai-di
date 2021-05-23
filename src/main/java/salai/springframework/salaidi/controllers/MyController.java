package salai.springframework.salaidi.controllers;

import org.springframework.stereotype.Controller;
/*
This is the very simple calling controller method
 */

@Controller
public class MyController {

    public String sayHello() {

        System.out.println("Hello World from Salai!!");

        return "Hi Folks!! this is Salai";
    }
}
