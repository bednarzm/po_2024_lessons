package pl.edu.pw.mini.po.solution.model;

import java.util.Objects;

public abstract class Flight implements Comparable<Flight> {

	protected String flightId;
	private String time;
	private String airline;

	public void apply(FlightVisitor flightVisitor) {}

	public Flight(String time, String flightId, String airline) {
		this.time = time;
		this.flightId = flightId;
		this.airline = airline;
	}

	@Override
	public int compareTo(Flight o) {
		return flightId.length() < o.flightId.length() ? -1 : flightId.length() > o.flightId.length() ? 1 : 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flightId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(flightId, other.flightId);
	}

}
