package behavioral.chainofresponsibility.ex1;

public class InputData {
	
	private String processName;
	private int value;
	
	public InputData(String processName, int value) {
		super();
		this.processName = processName;
		this.value = value;
	}
	
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "InputData [processName=" + processName + ", value=" + value + "]";
	}
	
	

}
