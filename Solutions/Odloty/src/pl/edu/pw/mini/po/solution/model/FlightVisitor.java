package pl.edu.pw.mini.po.solution.model;

import pl.edu.pw.mini.po.solution.model.arrival.Arrival;

public interface FlightVisitor {
	void visitArrival(Arrival arrival);
}
