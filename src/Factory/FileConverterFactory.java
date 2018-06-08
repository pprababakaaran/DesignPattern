package Factory;

import java.io.InputStream;

public class FileConverterFactory {
	
	public static Converter getConverter(String file)
	{
		Converter converter=null;
		
	 switch(file)
	 {
	 case "pdf":
		 converter= new PDFConverter();
		 break;
		 
	 case "word":
		 converter= new WordConverter();
		 
		default:
			
	 
	 }
		
		return converter;
		
	
	}

}
