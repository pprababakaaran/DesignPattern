package creational.design.patterns.singleton;

public class SingletonVolatile {
	private static volatile SingletonVolatile _instance; // volatile variable

	public static SingletonVolatile getInstance() {

		if (_instance == null) {
			synchronized (SingletonVolatile.class) {
				if (_instance == null)
					_instance = new SingletonVolatile();
			}

		}
		// Read more:
		// http://javarevisited.blogspot.com/2011/06/volatile-keyword-java-example-tutorial.html#ixzz4IEoYChGx

		return _instance;
	}
}
