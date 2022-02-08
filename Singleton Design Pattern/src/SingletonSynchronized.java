
public class SingletonSynchronized {
	
	 private static SingletonSynchronized instance; 
	  
	 //lazy instance creation but here its thread safe
	 //by making the creation into synchronized
	 
	  public static SingletonSynchronized getInstance() {
	    if(instance == null) {
		  
	    	// synchronize block
	    	synchronized (SingletonSynchronized.class) {
		        if(instance == null) {
		          instance = new SingletonSynchronized();
		        }
		      }
	    	
	    }
	    return instance;
	  }

}
