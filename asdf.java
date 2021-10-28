import ansi_terminal.*;
public class asdf{
	public static void main(String[] args){
		Terminal.rawMode();
		DisplayMap.displayMap(4,4);
		DisplayInfo.displayInfo();
		Terminal.cookedMode();
}
}
