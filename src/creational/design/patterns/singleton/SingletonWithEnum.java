package creational.design.patterns.singleton;

public enum SingletonWithEnum {
	INSTANCE;
	
	private static String testStr;
	
	private SingletonWithEnum()
	{
		
	}
	
	public String getTestStr() {
		testStr = "Enumtest";
		return testStr;
	}
}
