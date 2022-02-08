
public class NyPizza extends Pizza {

	NyPizza(Builder builder) {
		super(builder);
	size = builder.size;
	}

	public enum Size {
		SMALL, MEDIUM, LARGE
	}

	private final Size size;

	public static class Builder extends Pizza.Builder<Builder> {

		private Size size;

		public Builder(Size size) {
			this.size = size;
		}

		@Override
		public NyPizza build() {
			return new NyPizza(this);
		}

		@Override
		protected Builder self() {
			return this;
		}

		
	}

}
