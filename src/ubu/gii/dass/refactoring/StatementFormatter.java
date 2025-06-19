package ubu.gii.dass.refactoring;

import java.util.List;

public interface StatementFormatter {
	String formatHeader(String customerName);
	String formatRental(String movieTitle, double charge);
	String formatFooter(double totalAmount, int frequentRenterPoints);
}