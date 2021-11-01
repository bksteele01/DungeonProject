import ansi_terminal.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Terminal.rawMode();
		Scanner input = new Scanner(System.in);
		System.out.print("2021 Eygypt 24 miles from the Nile River");
		System.out.print("");
		System.out.print("You fall into a sink hole and find yourself falling for about 15 seconds.");
		System.out.print("You then come to a complete stop as you meet a pile of sand in the middle of complete darkness.");
		System.out.print("You feel nothing around you except for the ground you are on but in the far distance you see a faint glow of light");
		System.out.print("You stand up and walk blindly towards the light still feeling nothing around you like you are in a black void");
		System.out.print("Finally the closer you get to the light your surroundings start to appear and you see what looks to be an enterance way");
		
		System.out.print("Looking in you see walls of brown sand and rock with something written on the wall..");
		System.out.print("You read the wall and you spell it out the best you could 'sin..der..mag...ni' and then after a short pause your eyes grow wide");
		System.out.print("Somehow you have managed to fall into the great pyramid of Sinder, the pharaoh of Eygpt 2755 BCE, one of the richest/brutalist ever known");
		System.out.print("You must find your way out, and maybe even find some of the gold and loot left for the Pharaoh in his great grave, but watch out...");
		System.out.print("Danger could be around any corner....Good luck my friend....");

		Game.game();
/*		System.out.println("What is your name?");
		String name = input.next();
		Player player = new Player(name,100);
*/		Terminal.cookedMode();
	}
}

