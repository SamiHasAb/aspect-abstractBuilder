package parameterized;

public abstract class Node<T extends Node<T>> { // it accept itself and classes that extend from it 
	
	private	String name ;

	 T setName(String name) {
		this.name = name;
		return self();
	}
	 
	 protected abstract T self();
	
	 }

		
	class City extends Node<City> {
		
		int num;

		City setNum(int num) {
			this.num = num;
			return self();
		}

		@Override
		protected City self() {
			return this;
		}

	
				
	}

	
	
	//won't work
	
	/*	private	String name ;

	 Node setName(String name) {
		this.name = name;
		return this;
	}
		
	class City extends Node {
		
		int num;

		City setNum(int num) {
			this.num = num;
			return this;
		}
				
	}
*/
	
	

