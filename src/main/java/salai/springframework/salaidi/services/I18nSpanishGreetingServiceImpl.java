package salai.springframework.salaidi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")// it is combine writing of Service + Qualifier
public class I18nSpanishGreetingServiceImpl implements GreetingServiceForSpecific{
    @Override
    public String sayGreeting() {
        return "Hola en Español - I18n file";
    }
}
