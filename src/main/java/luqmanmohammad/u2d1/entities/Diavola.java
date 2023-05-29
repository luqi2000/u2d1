package luqmanmohammad.u2d1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Diavola extends Menu{
	
	//method
	public Diavola(){
		setNamePizza("Diavola");
		setPrice(getPrice()+2.5);
		setIngredient(getIngredient()+ ", salame piccante, peperoncino");
	}
}
