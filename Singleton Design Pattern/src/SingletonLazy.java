
public class SingletonLazy {
	 private static SingletonLazy instance; 
	  
	  
	 //getter
	  public static SingletonLazy getInstance() {
	    if(instance == null) {					// Here it will check 1st if the instance was created or not
	      instance = new SingletonLazy();		// then it will create it 
	    }
	    
	    return instance;
	  }
}
