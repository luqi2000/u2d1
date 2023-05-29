package luqmanmohammad.u2d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class U2d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U2d1Application.class, args);
		log.info("CIAO MONDO");
	}

}
