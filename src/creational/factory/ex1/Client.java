package creational.factory.ex1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter converter = FileConverterFactory.getConverter("pdf");
		converter.convert(null);
	}

}
