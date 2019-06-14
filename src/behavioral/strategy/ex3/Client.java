package behavioral.strategy.ex3;

public class Client {
	public static void main(String args[]) {
		AuthenticationController maker = new AuthenticationController(new BasicAuthStrategy());
		System.out.println(maker.validateUserToken("ABC"));
		
		maker = new AuthenticationController(new JWTStrategy());
		System.out.println(maker.validateUserToken("ABC"));
		
		maker = new AuthenticationController(new OAuthStrategy());
		System.out.println(maker.validateUserToken("ABC"));
		
	}
}
