package creational.singleton.ex1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleCheckedLockingSingleton.getInstance();
		
		String enumTest = SingletonWithEnum.INSTANCE.getTestStr();
		System.out.println(enumTest);

	}

}
