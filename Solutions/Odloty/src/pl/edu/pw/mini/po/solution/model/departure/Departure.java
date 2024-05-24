package pl.edu.pw.mini.po.solution.model.departure;

import pl.edu.pw.mini.po.solution.model.Flight;
import pl.edu.pw.mini.po.solution.model.arrival.ArrivalStatus;

public class Departure extends Flight {

	private String target;
	private ArrivalStatus arrivalStatus;
	private DepartureCheckInScope checkIn;

	public Departure(String time, String flightId, String airline, String target, ArrivalStatus arrivalStatus,
			DepartureCheckInScope checkIn) {
		super(time, flightId, airline);
		this.target = target;
		this.arrivalStatus = arrivalStatus;
		this.checkIn = checkIn;
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
