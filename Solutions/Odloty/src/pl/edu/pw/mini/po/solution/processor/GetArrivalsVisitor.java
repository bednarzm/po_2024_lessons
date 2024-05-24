package pl.edu.pw.mini.po.solution.processor;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pw.mini.po.solution.model.Flight;
import pl.edu.pw.mini.po.solution.model.FlightVisitor;
import pl.edu.pw.mini.po.solution.model.arrival.Arrival;

public class GetArrivalsVisitor implements FlightVisitor {

	private List<Flight> arrivals = new ArrayList<>();

	@Override
	public void visitArrival(Arrival arrival) {
		if (!arrival.isLanded()) {
			arrivals.add(arrival);
		}
	}

	public List<Flight> getExpectedArrivals() {
		return new ArrayList<>(arrivals);
	}

}
