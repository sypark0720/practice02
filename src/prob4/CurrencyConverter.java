package prob4;

public class CurrencyConverter {
	//field
	private static double RATE = 0.;

	//method
	public static double toDollar(double won) {
		double Dollar = won/RATE;
		return Dollar;
	}

	public static double toKWR(double dollar) {
		double KWR = dollar*RATE;
		return KWR;
	}

	
	//getter&setter
	public static void setRATE(double rATE) {
		RATE = rATE;
	}

	public static void main(String[] args) {
		setRATE(1208.5);
		System.out.println("백만원은 "+toDollar(1000000)+"달러입니다.");
		System.out.println("백달러는 "+toKWR(100)+"원입니다.");

	}
}
