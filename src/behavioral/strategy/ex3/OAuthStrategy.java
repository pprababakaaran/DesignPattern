package behavioral.strategy.ex3;

public class OAuthStrategy implements AuthStrategy {

	@Override
	public boolean authenticate(String token) {
		System.out.println("Authenticated using OAuth");
		return true;
	}

}
