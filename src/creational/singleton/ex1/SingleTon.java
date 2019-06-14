package creational.singleton.ex1;

public final class SingleTon {
	
	private static volatile SingleTon instance;
	
	private SingleTon() {
		
	}
	
	public static synchronized SingleTon getInstance() {
		if(instance == null) {
			instance = new SingleTon();
		}
		
		return instance;
	}

}
