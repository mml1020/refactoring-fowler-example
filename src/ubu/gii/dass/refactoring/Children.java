package ubu.gii.dass.refactoring;

public class Children extends Price {
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}
	
	public double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}
}