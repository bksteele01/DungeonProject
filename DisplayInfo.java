import ansi_terminal.*;
public class DisplayInfo{
	public static void displayInfo(){
		Terminal.setForeground(Color.RED);
		Terminal.warpCursor(1, 72);
        	System.out.print("Controls:");
        	Terminal.warpCursor(2, 75);
        	System.out.print("Movement: arrow keys");
        	Terminal.warpCursor(3, 75);
       		System.out.print("Attack: walk into monster");
        	Terminal.warpCursor(4, 75);
        	System.out.print("Pickup: p"); 
        	Terminal.warpCursor(40, 0);
        	Terminal.reset();
}
} 
