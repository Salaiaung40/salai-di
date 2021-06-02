package salai.springframework.salaidi.services;


import org.springframework.stereotype.Service;

/*
This method for the Specific controller with Specific service Implementation
 */
@Service
public class PropertyInjectedGreetingServiceSpecImpl implements GreetingServiceForSpecific {

    @Override
    public String sayGreeting() {
        return "Bonjour le monde  (FR) - Property";

    }
}
