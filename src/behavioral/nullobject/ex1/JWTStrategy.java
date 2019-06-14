package behavioral.nullobject.ex1;

public class JWTStrategy implements AuthStrategy {

	@Override
	public boolean authenticate(String token) {
		System.out.println("Authenticated using JWT");
		return true;
	}

}
