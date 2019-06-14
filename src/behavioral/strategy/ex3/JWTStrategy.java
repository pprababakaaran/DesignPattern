package behavioral.strategy.ex3;

public class JWTStrategy implements AuthStrategy {

	@Override
	public boolean authenticate(String token) {
		System.out.println("Authenticated using JWT");
		return true;
	}

}
