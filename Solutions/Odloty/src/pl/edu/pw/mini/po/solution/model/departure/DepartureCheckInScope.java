package pl.edu.pw.mini.po.solution.model.departure;

public class DepartureCheckInScope {

	private int from;
	private int to;

	public DepartureCheckInScope(String scope) throws WrongCheckInScopeException {
		String splitted[] = scope.split("-");

		int from = Integer.valueOf(splitted[0]);
		int to = Integer.valueOf(splitted[1]);
		if (from > to) {
			throw new WrongCheckInScopeException(from, to);
		}

		this.from = from;
		this.to = to;

	}

}
