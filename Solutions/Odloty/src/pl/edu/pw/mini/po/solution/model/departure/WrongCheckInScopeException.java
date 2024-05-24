package pl.edu.pw.mini.po.solution.model.departure;

public class WrongCheckInScopeException extends Exception {

	private static final long serialVersionUID = -39347070379718167L;

	public WrongCheckInScopeException(int from, int to) {
		super("Check-in scope should not \"from\" should not greather than \"to\": [" + from + ", " + to + "]");
	}

}
