package ubu.gii.dass.refactoring;

public class HtmlStatementFormatter implements StatementFormatter {
	public String formatHeader(String customerName) {
		return "<h1>Rental Record for <em>" + customerName + "</em></h1>\n<table>\n";
	}
	
	public String formatRental(String movieTitle, double charge) {
		return "\t<tr><td>" + movieTitle + "</td><td>" + String.valueOf(charge) + "</td></tr>\n";
	}
	
	public String formatFooter(double totalAmount, int frequentRenterPoints) {
		String result = "</table>\n";
		result += "<p>Amount owed is <em>" + String.valueOf(totalAmount) + "</em></p>\n";
		result += "<p>You earned <em>" + String.valueOf(frequentRenterPoints) + "</em> frequent renter points</p>";
		return result;
	}
}