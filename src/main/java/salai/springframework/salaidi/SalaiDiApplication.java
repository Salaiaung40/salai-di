package salai.springframework.salaidi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import salai.springframework.salaidi.controllers.MyController;

@SpringBootApplication
public class SalaiDiApplication {

	public static void main(String[] args) {
		// do not forget to add the ApplicationContext
		ApplicationContext ctx = SpringApplication.run(SalaiDiApplication.class, args);
		//simple Calling MyController class from here (Basic controller method)
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
