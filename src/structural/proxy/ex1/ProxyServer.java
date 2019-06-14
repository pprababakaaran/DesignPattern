package structural.proxy.ex1;

import java.util.ArrayList;
import java.util.List;

public class ProxyServer implements Internet {

	static List<String> blockedSites = new ArrayList<>();
	
	static
    { 
		blockedSites.add("xyz.com"); 
		blockedSites.add("abc.com"); 
    } 

	@Override
	public void connectTo(String url) {
		if (blockedSites.contains(url)) {
			System.out.println("Site is blocked..");
		} else {
			System.out.println("Displaying site through ProxyServer");
		}

	}

}
