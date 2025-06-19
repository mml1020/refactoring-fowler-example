package ubu.gii.dass.refactoring;

public class Regular extends Price {
	public int getPriceCode() {
		return Movie.REGULAR;
	}
	
	public double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}
}