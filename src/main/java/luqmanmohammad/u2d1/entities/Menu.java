package luqmanmohammad.u2d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Menu {
	
	private String namePizza;
	private double price = 5.50; //di base
	private String ingredient= "Pomodoro, mozzarella"; //di base
	private int calorie = 570;
}
