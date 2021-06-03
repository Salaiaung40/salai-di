package salai.springframework.salaidi.services;
/*
Using @Primary annotation is making the D.I to become primary if other controller method has fallen or miss out.
When other method is missing the primary key method will be injected and project to output.
 */

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreetingENG() {
        return "Hello World - Form Primary Bean";
    }

    @Override
    public String sayGreetingFR() {
        return null;
    }

    @Override
    public String sayGreetingNL() {
        return null;
    }
}