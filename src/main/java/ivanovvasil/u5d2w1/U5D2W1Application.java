package ivanovvasil.u5d1w1;

import ivanovvasil.u5d1w1.entities.Menu;
import ivanovvasil.u5d1w1.entities.Pizza;
import ivanovvasil.u5d1w1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class U5D1W1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5D1W1Application.class, args);
		configurationClass();
	}

	public static void configurationClass (){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext((U5D1W1Application.class));

		Menu menu = (Menu) ctx.getBean("getMenu");

		System.out.println(menu.toString().replaceAll("[,\\[\\]]", ""));

	}
}
