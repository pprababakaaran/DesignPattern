package creational.design.patterns.builder.ex2;


public class Menu {

	private final IPizza pizza;
	private final IDrinks drinks;

	public static class Builder {
		private IDrinks drinks;
		private IPizza pizza;

		public Builder drinks(IDrinks drinks) {
			this.drinks = drinks;
			return this;
		}

		public Builder pizza(IPizza pizza) {
			this.pizza = pizza;
			return this;
		}

		public Menu build() {
			return new Menu(this);
		}
	}

	private Menu(Builder builder) {
		this.drinks = builder.drinks;
		this.pizza = builder.pizza;
	}

	@Override
	public String toString() {
		return "Menu [pizza=" + pizza + ", drinks=" + drinks + "]";
	}

}
