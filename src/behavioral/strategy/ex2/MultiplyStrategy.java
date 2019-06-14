package behavioral.strategy.ex2;

public class MultiplyStrategy implements Strategy {

	@Override
	public int operation(int a, int b) {
		return a*b;
	}

}
