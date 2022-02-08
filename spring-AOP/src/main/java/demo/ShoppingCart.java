package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	
	public void checkout() {
		System.out.println("checkout method from shoppin cart is called... ");
	}
	
	public void checkoutWithParam(String status) {
		System.out.println("checkout method with parameter from shoppin cart is called... ");
	}
	
	public int quantity() {
		return 10;
	}
}
