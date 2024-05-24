package pl.edu.pw.mini.po.solution.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pl.edu.pw.mini.po.solution.model.Flight;
import pl.edu.pw.mini.po.solution.model.arrival.Arrival;
import pl.edu.pw.mini.po.solution.model.arrival.ArrivalStatus;
import pl.edu.pw.mini.po.solution.model.departure.Departure;
import pl.edu.pw.mini.po.solution.model.departure.DepartureCheckInScope;
import pl.edu.pw.mini.po.solution.model.departure.WrongCheckInScopeException;

public class FlightsParser {

	public static List<Flight> parseFlights(String resourceName) throws WrongCheckInScopeException {
		List<Flight> result = new ArrayList<Flight>();

		Scanner scanner = new Scanner(FlightsParser.class.getResourceAsStream(resourceName));
		scanner.useDelimiter("###");

		while (scanner.hasNextLine()) {
			String flightType = scanner.next();
			if ("O".equals(flightType)) {
				result.add(parseDeparture(scanner));
			} else {
				result.add(parseArrival(scanner));
			}
			scanner.nextLine();
		}

		scanner.close();

		return result;
	}

	private static Departure parseDeparture(Scanner scanner) throws WrongCheckInScopeException {
		return new Departure(scanner.next(), scanner.next(), scanner.next(), scanner.next(),
				ArrivalStatus.valueOf(scanner.next().toUpperCase()), new DepartureCheckInScope(scanner.next()));
	}

	private static Arrival parseArrival(Scanner scanner) {
		String time = scanner.next();
		String from = scanner.next();
		String flightId = scanner.next();
		String airline = scanner.next();
		boolean landed = scanner.nextBoolean();
		Integer exit = scanner.nextInt();

		return new Arrival(time, flightId, airline, from, landed, exit);
	}

}
