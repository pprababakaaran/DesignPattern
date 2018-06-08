package Factory;

import java.io.FileInputStream;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in=null;
		Converter pdf= FileConverterFactory.getConverter("pdf");
		System.out.println(pdf.convert(in));
		
		Converter word= FileConverterFactory.getConverter("word");
	
		System.out.println(word.convert(in));
		
		
		

	}

}
