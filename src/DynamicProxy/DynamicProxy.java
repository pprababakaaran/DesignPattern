package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashSet;

public class DynamicProxy implements InvocationHandler  {
	
	private Object realObject = null;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		Object result=null;
		
		
		result=method.invoke(realObject, args);
		
		return null;
	}

	
	
	
}

	

