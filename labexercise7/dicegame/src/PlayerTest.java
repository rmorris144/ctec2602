import java.util.ArrayList;
public class PlayerTest {

	
	public static void main(String[] args) {
		ArrayList<Player> playerlist = new ArrayList<Player>();
		Player winner = null;
		int flag = 0;
		
		playerlist.add(new Player(new Name("Ryan", "Morris"), new PairOfDice()));
		playerlist.add(new Player(new Name("Sam", "Jones"), new PairOfDice()));
		playerlist.add(new Player(new Name("percy", "rarted"), new PairOfDice()));
		
		for (Player p : playerlist) {
			p.rollDice();
			System.out.println(p.getName() + " score: " + p.getDiceScore());
		}
		
		for(Player p: playerlist) {
			if (p.getDiceScore() > flag) {
				flag = p.getDiceScore();
				winner = p;
			}
		}
		System.out.println("\nThe winner is " + winner.getName() + " score: " + winner.getDiceScore());
	}
}
