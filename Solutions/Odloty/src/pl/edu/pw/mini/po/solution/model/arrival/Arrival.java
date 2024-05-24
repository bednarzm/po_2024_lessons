package pl.edu.pw.mini.po.solution.model.arrival;

import pl.edu.pw.mini.po.solution.model.Flight;
import pl.edu.pw.mini.po.solution.model.FlightVisitor;

public class Arrival extends Flight {

	private String from;
	private boolean landed;
	private int exitNo;

	public Arrival(String time, String flightId, String airline, String from, boolean landed, int exitNo) {
		super(time, flightId, airline);
		this.from = from;
		this.landed = landed;
		this.exitNo = exitNo;
	}

	@Override
	public void apply(FlightVisitor flightVisitor) {
		flightVisitor.visitArrival(this);
	}

	public boolean isLanded() {
		return landed;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

}
