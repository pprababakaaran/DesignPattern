package behavioral.nullobject.ex1;

import java.util.Optional;

public class Client {
	public static void main(String args[]) {
		
		AuthStrategy authStrategy = AuthStrategyFactory.getAuth("JWT");
		
		AuthenticationController maker = new AuthenticationController(authStrategy);
		System.out.println(maker.validateUserToken("ABC"));
		
		authStrategy = AuthStrategyFactory.getAuth("Basic");
		maker = new AuthenticationController(authStrategy);
		System.out.println(maker.validateUserToken("ABC"));
		
		authStrategy = AuthStrategyFactory.getAuth("OAuth");

		maker = new AuthenticationController(authStrategy);
		System.out.println(maker.validateUserToken("ABC"));
		
		authStrategy = AuthStrategyFactory.getAuth("SSO");
		maker = new AuthenticationController(authStrategy);
		System.out.println(maker.validateUserToken("ABC"));

		Optional<String> obj = null;
		System.out.println(obj.ofNullable("Hello").get());
	}
}
