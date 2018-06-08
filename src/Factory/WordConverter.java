package Factory;

import java.io.FileInputStream;

public class WordConverter implements Converter {

	@Override
	public String convert(FileInputStream input) {
		// TODO Auto-generated method stub
		return "Word converted String";
	}

}
