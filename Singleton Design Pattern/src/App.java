
public class App {

	public static void main(String[] args) {

		// get the same instance or object
		
		//eager initialization
		
		SingletonEager instance = SingletonEager.getInstance();
		    
		System.out.println(instance);
		    
	    SingletonEager instance1 = SingletonEager.getInstance();
		    
	    System.out.println(instance1);
		  
		 //	lazy initialization 
			
		
		SingletonLazy instance3 = SingletonLazy.getInstance();
	    
		System.out.println(instance3);
		    
		SingletonLazy instance4 = SingletonLazy.getInstance();
		    
	    System.out.println(instance4);	
		
	    //synchronize initialization ... widely used
	    
	    SingletonSynchronized instance5 = SingletonSynchronized.getInstance();
	    
	    System.out.println(instance5);
	    
	    SingletonSynchronized instance6 = SingletonSynchronized.getInstance();
	    
	    System.out.println(instance6);
	}

}
