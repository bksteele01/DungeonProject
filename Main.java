import ansi_terminal.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Terminal.rawMode();
		Scanner input = new Scanner(System.in);
		System.out.print("Setting: 2021 Eygypt 24 miles from the Nile River\n \r");
		System.out.print("\n \r");
		System.out.print("Plot:\n \r");
		System.out.print("You fall into a sink hole and find yourself falling in complete darkness..\n \r");
		System.out.print("You then come to a stop as you meet a pile of sand, still with no light.\n \r");
		System.out.print("You see nothing around you but in the far distance you see a faint glow of light.\n \r");
		System.out.print("You stand up and walk blindly towards the light. \n \r" );
		System.out.print("Finally the closer you get to the light the more you see what looks to be an enterance way\n \r");
		System.out.print("Looking in you see walls of rock with words saying....\n \r");
		System.out.print("'sin..der..mag...ni' and then after a short pause your eyes grow wide\n \r");
		System.out.print("Somehow you have managed to fall into the great pyramid of Sinder, the pharaoh of Eygpt 2755 BCE, one of the richest/brutalist ever known\n \r");
		System.out.print("You must find your way out, and maybe even find some of the loot left for the Pharaoh in his great grave, but watch out...\n \r");
		System.out.print("Danger could be around any corner....Good luck my friend..??\n \r");

		Game.game();
		
		Terminal.cookedMode();
	}
}

// javac -cp ".:ansi_terminal.jar" *.java  To compile with terminal 
// java -cp ".:ansi_terminal.jar" Main   To run with teminal 

