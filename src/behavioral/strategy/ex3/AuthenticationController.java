package behavioral.strategy.ex3;

public class AuthenticationController {

	private AuthStrategy strategy;

	public AuthenticationController(AuthStrategy strategy) {
		this.strategy = strategy;

	}

	public boolean validateUserToken(String token) {
		return strategy.authenticate(token);
	}

}
