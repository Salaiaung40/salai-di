package salai.springframework.salaidi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceSpecImpl implements GreetingServiceForSpecific{

    @Override
    public String sayGreeting() {
        return "Hello World (ENG) - Setter";
    }
}
