package ubu.gii.dass.refactoring;

public abstract class Price {
	public abstract int getPriceCode();
	
	public abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}