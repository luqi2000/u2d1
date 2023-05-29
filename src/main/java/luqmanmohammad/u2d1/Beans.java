package luqmanmohammad.u2d1;

import java.awt.Menu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import luqmanmohammad.u2d1.entities.Margherita;

@Configuration
public class Beans {
	
	
	@Bean
	public Margherita margherita() {
		return new Margherita();
	}
}