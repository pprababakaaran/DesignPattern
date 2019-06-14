package behavioral.template.ex1;

public abstract class Worker {
	
	public void dailyRoutine() {
		getUp();
		eatBreakfast();
		goToWork();
		work();
		relax();
		sleep();
		
	}
	
	public void getUp() {
		System.out.println("Getting up");
	}
	
	public void eatBreakfast() {
		System.out.println("Eating Breakfast");
	}

	public void goToWork() {
		System.out.println("Going to work");
	}
	
	public abstract void work();
	
	public void returnToHome() {
		System.out.println("Returning to home");
	}
	
	public void relax() {
		System.out.println("Relaxing");
	}
	
	public void sleep() {
		System.out.println("Sleeping");
	}
	
	
}
