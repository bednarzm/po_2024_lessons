package pl.edu.pw.mini.po.solution.processor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pl.edu.pw.mini.po.solution.model.Flight;

public class FlightsProcessor {

	private List<Flight> allFlights;

	public FlightsProcessor(List<Flight> allFlights) {
		this.allFlights = allFlights;
	}

	public List<Flight> getExpectedArrivals() {
		GetArrivalsVisitor getArrivalsVisitor = new GetArrivalsVisitor();
		for (Flight flight : allFlights) {
			flight.apply(getArrivalsVisitor);
		}

		return getArrivalsVisitor.getExpectedArrivals();
	}

	public List<Flight> getFlightsOrdered() {
		List<Flight> result = new ArrayList<>(allFlights);

		Collections.sort(result);

		return result;
	}

}
