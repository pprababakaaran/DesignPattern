package behavioral.strategy.ex2;

public class StrategyMaker {
	private Strategy strategy;
	
	
	public StrategyMaker(Strategy strategy)
	{
		this.strategy=strategy;
		
	}

	public int performOperation(int a, int b)
	{
		return strategy.operation(a, b);
	}
	
	
}
