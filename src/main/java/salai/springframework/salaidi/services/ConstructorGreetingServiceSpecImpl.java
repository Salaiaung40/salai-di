package salai.springframework.salaidi.services;


import org.springframework.stereotype.Service;
/*
This method for the Specific controller with Specific service Implementation
 */
@Service
public class ConstructorGreetingServiceSpecImpl implements GreetingServiceForSpecific {

    @Override
    public String sayGreeting() {
        return "Hallo Wereld (NL)- Constructor";
    }
}
