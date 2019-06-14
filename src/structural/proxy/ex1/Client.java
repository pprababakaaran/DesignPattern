package structural.proxy.ex1;

//Reference : https://www.geeksforgeeks.org/proxy-design-pattern/
public class Client {
	public static void main(String[] args) {
		Internet internet = new ProxyServer();
		internet.connectTo("testing.com");
		internet.connectTo("abc.com");
	}
}
