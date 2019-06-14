package srp1.calculator;

public class AreaOutput {
	
	int sum;
	
	public AreaOutput(int sum) {
		this.sum = sum;
	}
	
	public void outputHTML() {
		System.out.println("<h1>"+sum+"</h1>");
	}
	
	public void outputJSON() {
		System.out.println("{'output':"+sum+"}");
	}

}
