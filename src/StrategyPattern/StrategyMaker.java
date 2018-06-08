package StrategyPattern;

public class StrategyMaker {
	private StragegyInterface strategy;
	
	
	public StrategyMaker(StragegyInterface strategy)
	{
		this.strategy=strategy;
		
	}

	public int performOperation(int a, int b)
	{
		return strategy.operation(a, b);
	}
	
	
}
