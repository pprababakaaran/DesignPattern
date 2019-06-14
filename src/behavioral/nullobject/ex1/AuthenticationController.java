package behavioral.nullobject.ex1;

public class AuthenticationController {

	private AuthStrategy strategy;

	public AuthenticationController(AuthStrategy strategy) {
		this.strategy = strategy;

	}

	public boolean validateUserToken(String token) {
		return strategy.authenticate(token);
	}

}
