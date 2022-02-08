
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calzone c = new Calzone.Builder()
				.addTopping(Pizza.Topping.MUSHROOM)
				.sauceInside()
				.build();
		
		
		NyPizza n = new NyPizza.Builder(NyPizza.Size.LARGE)
				.addTopping(Pizza.Topping.SAUSAGE)
				.addTopping(Pizza.Topping.ONION)
				.build();
		
		
		System.out.println(c);
		System.out.println(n);
		
	}

}
