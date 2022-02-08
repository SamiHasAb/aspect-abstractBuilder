
public class SingletonEager {

	 private static SingletonEager instance = new SingletonEager(); 
	 //creating the instance at the same time we are declaring it 
	 // so it will be created once 
	  
	  
	  //getter 
	  public static SingletonEager getInstance() {
	    return instance;
	  }
	
	  // Here singleton on eager it will create  the instance whenever thae class is called 
	  
}
