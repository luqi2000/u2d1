package luqmanmohammad.u2d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;
import luqmanmohammad.u2d1.entities.Diavola;
import luqmanmohammad.u2d1.entities.Margherita;
@Slf4j
@SpringBootApplication
public class U2d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U2d1Application.class, args);
		log.info("CIAO MONDO");
		configWithConfigurationAnnotation();
		
	}
	public static void configWithConfigurationAnnotation() {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		
		Margherita margherita = (Margherita) ctx.getBean("margherita");
		log.info(margherita.toString());
		
		
		Diavola diavola= (Diavola) ctx.getBean("diavola");
		log.info(diavola.toString());

		ctx.close();

	}
}


