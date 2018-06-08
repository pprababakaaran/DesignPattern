package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class SingleTonTest {

	public static void main(String[] args) {
		
		Singleton instance1= Singleton.getInstance();
		
		Singleton instance2= null;
		// TODO Auto-generated method stub
		
		System.out.println("instance1 hashcode="+instance1.hashCode());
		
	//	System.out.println("instance2 hashcode="+instance2.hashCode());
		
		
		//singleton breakers
		
		Constructor[] constructors=instance1.getClass().getDeclaredConstructors();
		
		System.out.println(constructors.length);
		for(Constructor construct:constructors)
		{
			System.out.println("here");
			construct.setAccessible(true);
			try {
				instance2= (Singleton)construct.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			
		}
	
		
		
		System.out.println("instance2 hashcode="+instance2.hashCode());
		

	}

}
