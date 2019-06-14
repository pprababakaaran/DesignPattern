package behavioral.chainofresponsibility.ex1;

public class Client {
	
	public static void main(String args[]) {
		
		Task task1 = new Task1();
		Task task2 = new Task2();
		Task task3 = new Task3();
		
		task1.setNextTask(task3);
		task3.setNextTask(task2);
		
		InputData data = new InputData("Task", 10);
		task1.calculate(data);
	
		
	}

}
