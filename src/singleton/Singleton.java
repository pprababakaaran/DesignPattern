package singleton;

public class Singleton {
	
	public static Singleton instance;
	
	private Singleton()
	{
		System.out.println("Object created");
		
	}
	
	public static Singleton getInstance()
	{
		
		synchronized (Singleton.class) {
			
			if(instance==null)
			{
				instance= new Singleton();
			}
				
			
				
			
		}
		return instance;
		
	}
	
	public void businessLogic()
	{
		System.out.println("Business Logic");
	}
	
	

}

