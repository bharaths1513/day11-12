package day11_12;

public class stock {

	String shareName;
	int NumOfShare;
	int SharePrice;

	public stock(String ShareName, int NumOfShare, int SharePrice) {
		shareName = ShareName;
		NumOfShare = NumOfShare;
		SharePrice = SharePrice;

	}

	public int valueOfStock() {
		return NumOfShare * SharePrice;
	}

	public String toString() {
		return "Total Share Value of stock " + shareName + " is " + NumOfShare * SharePrice;
	}
}
