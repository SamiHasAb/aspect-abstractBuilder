import java.util.Set;
import java.util.EnumSet;
import java.util.Objects;

public abstract class Pizza {
	
	//can be chande to a variable
	public enum Topping{
		MUSHROOM, ONION, PEPPER, SAUSAGE
	}
	
	final Set<Topping> toppings ;

	// do this after creating build class
	Pizza(Builder<?> builder){
		toppings = builder.toppings.clone();
		}

	abstract static class Builder<T extends Builder<T>>{
		
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		
		public T addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}
		abstract Pizza build();
		
		// subclass must override this to return "this"
		protected abstract T self();
	}
}
