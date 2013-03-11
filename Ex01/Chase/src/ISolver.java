//Solver: Implementation of a graph search algorithm in the state space of some game
public interface ISolver {
	
	// Runs the solver, starting from initialState. Returns a queue of
	// States that represents the path from initialState to a winning state,
	// if it can find one. 
	public int solve(IState initialState);
}

