package ubu.gii.dass.refactoring;

/**
* Tema  Refactorizaciones 
*
* Ejemplo de aplicaci�n de refactorizaciones. Actualizado para colecciones gen�ricas de java 1.5
*
* @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
* @version 1.1
* @see java.io.File
*
*/
import java.util.*;

public class Customer {
	private String _name;
	private List<Rental> _rentals;

	public Customer(String name) {
		_name = name;
		_rentals = new ArrayList<Rental>();

	};

	public void addRental(Rental arg) {
		_rentals.add(arg);
	}

	public String getName() {
		return _name;
	};

	public String statement() {
		return generateStatement(new TextStatementFormatter());
	}
	
	public String htmlStatement() {
		return generateStatement(new HtmlStatementFormatter());
	}
	
	private String generateStatement(StatementFormatter formatter) {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = formatter.formatHeader(getName());
		
		for (Rental each : _rentals) {
			double thisAmount = each.getCharge();
			frequentRenterPoints += each.getFrequentRenterPoints();
			result += formatter.formatRental(each.getMovie().getTitle(), thisAmount);
			totalAmount += thisAmount;
		}
		
		result += formatter.formatFooter(totalAmount, frequentRenterPoints);
		return result;
	}
	
	
}
