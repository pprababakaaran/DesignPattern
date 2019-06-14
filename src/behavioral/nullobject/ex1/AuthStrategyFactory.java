package behavioral.nullobject.ex1;

public class AuthStrategyFactory {
	
	public static AuthStrategy getAuth(String type) {
		AuthStrategy authStrategy = null;
		
		switch (type) {
		case "JWT":
			authStrategy = new JWTStrategy();
			break;

		case "Basic":
			authStrategy = new BasicAuthStrategy();
			break;
			
		case "OAuth":
			authStrategy = new OAuthStrategy();
			break;
		default:
			authStrategy = new NullStrategy();
			break;
		}
		
		return authStrategy;
		
	}

}
