package creational.singleton.ex1;

public class DoubleCheckedLockingSingleton {
	
	private static volatile DoubleCheckedLockingSingleton INSTANCE;
	
	private DoubleCheckedLockingSingleton(){
		
	}
	
	public static DoubleCheckedLockingSingleton getInstance() {
		if(INSTANCE == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if(INSTANCE == null){
					INSTANCE = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return INSTANCE;
	}

}
