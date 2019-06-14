package behavioral.strategy.ex2;

public class Client {
	public static void main(String args[]) {
		StrategyMaker maker = new StrategyMaker(new MultiplyStrategy());
		System.out.println(maker.performOperation(2, 9));
		
		maker = new StrategyMaker(new AddStrategy());
		System.out.println(maker.performOperation(2, 9));
		
		maker = new StrategyMaker(new SubtractStrategy());
		System.out.println(maker.performOperation(2, 9));
		
	}
}
