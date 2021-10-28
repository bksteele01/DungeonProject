import java.util.Scanner;
public class Game {

	public static void game() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.next();
		Player player = new Player(name,100);
	}

}
