package structural.dependencyinjection.ex1;

public class ShoppingMall {
	
	public static String getPopCorn(String type, int proportion) {
		ApplicationContext appContext = new ApplicationContext();
		Popcorn p1 = appContext.getPopCorn(type, proportion);
		p1.preparePopCorn();
		return type;
	}

}
