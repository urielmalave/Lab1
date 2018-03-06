package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		current = current + commonDifference; 
		return current;
	}
	
	@Override
	public String toString() {
		return "Arith("+(int)firstValue()+","+(int)commonDifference+")";
	}
	
	public double getTerm(int n) throws IndexOutOfBoundsException {
		if (n <=0) throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " +n);
		return firstValue()+commonDifference*(n-1);
	}

}
