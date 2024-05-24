package pl.edu.pw.mini.po.solution;

import java.util.List;

import pl.edu.pw.mini.po.solution.model.Flight;
import pl.edu.pw.mini.po.solution.model.departure.WrongCheckInScopeException;
import pl.edu.pw.mini.po.solution.parser.FlightsParser;
import pl.edu.pw.mini.po.solution.processor.FlightsProcessor;

public class Demonstrator {

	public static void main(String[] args) {

		try {
			List<Flight> parsedFlights = FlightsParser.parseFlights("/loty.txt");
			FlightsProcessor flightsProcessor = new FlightsProcessor(parsedFlights);

			flightsProcessor.getExpectedArrivals();
			flightsProcessor.getFlightsOrdered();

			FlightsParser.parseFlights("/loty_bad.txt");

		} catch (WrongCheckInScopeException e) {
			e.printStackTrace();
		}

	}

}
