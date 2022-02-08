
public class Person {

	private int id ;
	private String name;
	
	public Person(Builder builder) {
		this.id = builder.id;
		this.name=builder.name;	
	}
	
	//only setters
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static class Builder { 

		private int id ;
		private String name;

		// setters
		public Builder id(int id ) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name ) {
			this.name = name;
			return this;
		}

		public Person build() {
			
			return new Person(this);  // this is the builder class
		}

	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	

	
}
