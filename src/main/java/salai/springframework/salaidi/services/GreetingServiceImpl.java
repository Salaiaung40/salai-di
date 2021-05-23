package salai.springframework.salaidi.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetingENG() {
        return "Hello World in English" + " - ENG";
    }

    @Override
    public String sayGreetingFR() {
        return "Bonjour le monde en Français" + " - FR";
    }

    @Override
    public String sayGreetingNL() {
        return "Hallo Wereld in Nederland" + " - NL";
    }
}
