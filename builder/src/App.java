public class App {

	public static void main(String[] args) {


		
		Person p1 = new Person.Builder()
				.id(1)
				.name("sami")
				.build();
		
		System.out.println(p1);
		
	}

}
