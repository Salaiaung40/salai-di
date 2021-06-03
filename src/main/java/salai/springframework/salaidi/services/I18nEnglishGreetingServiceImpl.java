package salai.springframework.salaidi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")// it is combine writing of Service + Qualifier
public class I18nEnglishGreetingServiceImpl implements GreetingServiceForSpecific{
    @Override
    public String sayGreeting() {
        return "Hello in English - I18n file";
    }
}
