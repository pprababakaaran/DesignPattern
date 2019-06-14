package structural.proxy.ex1;

public class RealServer implements Internet{

	@Override
	public void connectTo(String url) {
		System.out.println("Displaying site through RealServer");
	}

}
