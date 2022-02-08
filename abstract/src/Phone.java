
public abstract class Phone {

	public abstract void show();

}

class Iphone extends Phone {

	@Override
	public void show() {
		System.out.println("This is an Iphone");

	}

}

class Samsung extends Phone {

	@Override
	public void show() {

		System.out.println("This is a Samsung");
	}

}