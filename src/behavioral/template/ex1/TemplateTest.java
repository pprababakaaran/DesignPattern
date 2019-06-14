package behavioral.template.ex1;

public class TemplateTest {

	public static void main(String[] args) {

		System.out.println("==========================");
		System.out.println("        Postman");
		System.out.println("==========================");
		Worker postman = new Postman();
		postman.dailyRoutine();
		
		System.out.println("==========================");
		System.out.println("        Manager");
		System.out.println("==========================");
		Worker manager = new Manager();
		manager.dailyRoutine();
		
		System.out.println("==========================");
		System.out.println("       FireFighter");
		System.out.println("==========================");
		Worker fireFighter = new FireFighter();
		fireFighter.dailyRoutine();
		
		System.out.println("==========================");
		System.out.println("        LumberJack");
		System.out.println("==========================");
		Worker lumberJack = new LumberJack();
		lumberJack.dailyRoutine();
		
	}

}
