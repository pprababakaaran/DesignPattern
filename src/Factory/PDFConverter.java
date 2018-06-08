package Factory;

import java.io.FileInputStream;

public class PDFConverter implements Converter {
	
	public PDFConverter()
	{
		System.out.println("PDF converter created");
	}

	@Override
	public String convert(FileInputStream input) {
		// TODO Auto-generated method stub
		return "PDF Convertered html";
	}

}
