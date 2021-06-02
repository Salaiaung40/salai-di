package salai.springframework.salaidi.services;

public interface GreetingServiceForSpecific {
    String sayGreeting();

}
/*
This is for the one method but it goes to each specific Impl file.
ConstructorGreetingServiceSpecificImpl (CGSSI), PIGSSI, SIGSSI
Need to create new Interface because the Impl class need only one method.
You can use Greeting Service Interface but have to assign others return "null" in the Impl class.
e.g see at the "ConstructorGreetingServiceImplSpecificSample" file.
 */