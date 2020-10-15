import java.math.BigInteger;

public class H05_hilos extends Thread{
	private int startNum;
	private int endNum;

	public H05_hilos(int startNum, int endNum) {
		super();
		this.startNum = startNum;
		this.endNum = endNum;
	}

	BigInteger bigInteger;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(startNum < endNum) {
			bigInteger = new BigInteger(String.valueOf(startNum));
			if(bigInteger.isProbablePrime(1)) {
				System.out.println(bigInteger + " es primo.");
			}
			startNum++;
		}
	}
}
