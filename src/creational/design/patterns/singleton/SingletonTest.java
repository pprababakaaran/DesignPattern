package creational.design.patterns.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleCheckedLockingSingleton.getInstance();
		
		String enumTest = SingletonWithEnum.INSTANCE.getTestStr();
		System.out.println(enumTest);

	}

}
