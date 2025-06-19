package ubu.gii.dass.refactoring;

public class TextStatementFormatter implements StatementFormatter {
	public String formatHeader(String customerName) {
		return "Rental Record for " + customerName + "\n";
	}
	
	public String formatRental(String movieTitle, double charge) {
		return "\t" + movieTitle + "\t" + String.valueOf(charge) + "\n";
	}
	
	public String formatFooter(double totalAmount, int frequentRenterPoints) {
		String result = "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;
	}
}