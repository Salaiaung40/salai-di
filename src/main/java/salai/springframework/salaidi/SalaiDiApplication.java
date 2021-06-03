package salai.springframework.salaidi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import salai.springframework.salaidi.controllers.*;

@SpringBootApplication
public class SalaiDiApplication {

	public static void main(String[] args) {
		// do not forget to add the ApplicationContext
		ApplicationContext ctx = SpringApplication.run(SalaiDiApplication.class, args);
		//simple Calling MyController class from here (Basic controller method)
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("----Basic method-----");
		String greeting = myController.sayHello();

		System.out.println(greeting + "\n");

		System.out.println(" ######## Primary Bean ############");
		System.out.println(myController.sayHello() + "\n");

		/*
		This part is injecting springFramework controller DI

		 */

		System.out.println(" ########## Property ##############" );
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("------> 1 interface with 1 combine implement <-----");
		System.out.println(propertyInjectedController.getGreetingFR() + "\n");
		System.out.println("-----> 1 interface with individual/specific implement <-----");
		System.out.println(propertyInjectedController.getGreetingPro() + "\n" +"\n");
			/* This will get error coz spring does not know that the manage component.
		Thus you need to assign the annotated "@Controller" at PropertyInjectedController Class.
		And that add "@Autowired" to initialisation (public GreetingService greetingService).
		 */

		System.out.println(" ########## Setter ##############" );
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("-----> 1 interface with 1 combine implement <-----");
		System.out.println(setterInjectedController.getGreetingENG()+ "\n");
		System.out.println("-----> 1 interface with individual/specific implement <-----");
		System.out.println(setterInjectedController.getGreetingSetter()+ "\n"+ "\n");

		System.out.println(" ########## Constructor ##############" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("-----> 1 interface with 1 combine implement <-----");
		System.out.println(constructorInjectedController.getGreetingNL()+ "\n");
		System.out.println("-----> 1 interface with individual/specific implement <-----");
		System.out.println(constructorInjectedController.getGreeting()+ "\n"+ "\n");

		System.out.println("########## I18n controller ##############");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("-----> This is the result of working with @Profile annotation  <-----");
		//need to specify the active profile name at application.properties file
		System.out.println(i18nController.sayHello() + "\n");

	}

}
