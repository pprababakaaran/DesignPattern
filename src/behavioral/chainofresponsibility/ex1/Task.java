package behavioral.chainofresponsibility.ex1;

public interface Task {
	
	void setNextTask(Task nextTask);
	
	void calculate(InputData input);

}
