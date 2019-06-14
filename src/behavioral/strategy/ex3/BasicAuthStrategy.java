package behavioral.strategy.ex3;

public class BasicAuthStrategy implements AuthStrategy {

	@Override
	public boolean authenticate(String token) {
		System.out.println("Authenticated using Basic Authentication");
		return true;
	}

}
