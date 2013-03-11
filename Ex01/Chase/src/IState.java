import java.util.Set;

public interface IState {
	public Set<IState> nextStates();
	public boolean isWinning();
	public void print();
}
