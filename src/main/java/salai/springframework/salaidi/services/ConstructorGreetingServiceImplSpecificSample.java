package salai.springframework.salaidi.services;


import org.springframework.stereotype.Service;
//This is just the example for the  with more than 1 method.
// other unwanted methods need to change return value "null".

@Service
public class ConstructorGreetingServiceImplSpecificSample implements GreetingService {
    @Override
    public String sayGreetingENG() {
        return null;
    }

    @Override
    public String sayGreetingFR() {
        return null;
    }

    @Override
    public String sayGreetingNL() {
        return "Hallo Wereld - Constructor";
    }
}
