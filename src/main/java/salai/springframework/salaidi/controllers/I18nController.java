package salai.springframework.salaidi.controllers;
/*
This is targeting to the specific IMPL file by using profile annotation
This Profile annotation work only one targeted IMPL file form resource=>application.properties
 */

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import salai.springframework.salaidi.services.GreetingServiceForSpecific;

@Controller
public class I18nController {
    private final GreetingServiceForSpecific greetingServiceForSpecific;

    public I18nController(@Qualifier("i18nService") GreetingServiceForSpecific greetingServiceForSpecific) {
        this.greetingServiceForSpecific = greetingServiceForSpecific;
    }

    public String sayHello(){
        return greetingServiceForSpecific.sayGreeting();
    }
}
