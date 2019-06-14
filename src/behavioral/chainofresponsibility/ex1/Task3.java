package behavioral.chainofresponsibility.ex1;

public class Task3 implements Task{

	private Task nextTask;
	
	@Override
	public void setNextTask(Task nextTask) {
		this.nextTask = nextTask;
		
	}

	@Override
	public void calculate(InputData input) {
		input.setProcessName("Task3");
		input.setValue(input.getValue()+10);
		System.out.println(input.toString());

		if (this.nextTask != null) {
			this.nextTask.calculate(input);
		}
	}

}
