package behavioral.nullobject.ex1;

public class NullStrategy implements AuthStrategy {

	@Override
	public boolean authenticate(String token) {
		System.out.println("Wrong strategy input given");
		return false;
	}

}
